package irvine.oeis.a007;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007154 Spectrum of the free Kleene algebra on n free variables.
 * @author Sean A. Irvine
 */
public class A007154 extends Sequence0 {

  // A ternary logic problem.
  // Each step of the sequence we introduce one more variable into the expressions.
  // We use 2 bits per value of the logic (00, 01, 11), 10 is not used.
  // The advantage of this representation is that the two operations are then
  // simple bitwise "or" and "and".
  // We retain only the truth-table values in canonical order, and the whole
  // truth value is packed into a long.

  // Note this implementation only works up to three variables. The technique
  // could be extended to more variables (using BitSet of Z rather than long),
  // but the search would be prohibitively slow.  Even if you were prepared to
  // wait for n==4, if would be completed infeasible for n==5.

  private int mN = -1;
  private int mCells = 1;
  private final Set<Long> mTables = new TreeSet<>();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  static long complement(final long table, final long cells) {
    // (00,01,11) -> (11,01,00)
    long complement = 0;
    long a = table;
    for (int k = 0; k < cells; ++k) {
      complement |= (3L >> (a & 3)) << (2 * k); // L critical here for type!
      a >>>= 2;
    }
    return complement;
  }

  private static long op1(final long table1, final long table2) {
    return table1 | table2;
  }

  private static long op2(final long table1, final long table2) {
    return table1 & table2;
  }

  long create(final int n) {
    // Create identity variable (depends on 0 <= n < mN)
    // Should be able to generalize this, but no point since we can't really do more than mN == 3 anyway
    if (mN == 1) {
      return 0b000111;
    }
    if (mN == 2) {
      return n == 0
        ? 0b000111000111000111
        : 0b000000010101111111;
    }
    if (mN == 3) {
      switch (n) {
        case 0:
          return 0b000111000111000111000111000111000111000111000111000111L;
        case 1:
          return 0b000000010101111111000000010101111111000000010101111111L;
        default:
          return 0b000000000000000000010101010101010101111111111111111111L;
      }
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mCells *= 3;
    mTables.clear();
    final Set<Long> newTables = new TreeSet<>();
    final LinkedList<Long> list = new LinkedList<>();
    for (int k = 0; k < mN; ++k) {
      final long var = create(k);
      mTables.add(var);
      list.add(var);
      // It is sufficient to apply the complement for initial variables
      // and thereafter ignore it.  This means we don't have to compute
      // the complement of each table as we proceed.
      final long complement = complement(var, mCells);
      mTables.add(complement);
      list.add(complement);
    }
    while (!list.isEmpty()) {
      final long table = list.pollFirst();
      // Apply operations with all existing values
      newTables.clear();
      for (final long t : mTables) {
        if (t <= table) { // symmetry speed up
          final long op1 = op1(t, table);
          if (!mTables.contains(op1)) {
            newTables.add(op1);
          }
          final long op2 = op2(t, table);
          if (!mTables.contains(op2)) {
            newTables.add(op2);
          }
        }
      }
      list.addAll(newTables);
      mTables.addAll(newTables);
      if (mVerbose) {
        System.out.println("size now " + mTables.size() + " queue=" + list.size());
      }
    }
    return Z.valueOf(mTables.size());
  }
}
