package irvine.oeis.a377;

import java.util.Arrays;

import irvine.math.api.Group;
import irvine.math.graph.Graph;
import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A377573 Cogrowth sequence for the 14-element dihedral group D7 = &lt;S,T | S^7, T^2, (ST)^2&gt;.
 * @author Sean A. Irvine
 */
public class A377573 extends Sequence0 {

  // After method described by Allan Wechsler on SeqFan mailing list, 2024-11-02

  private final int[][] mTransitions;
  private final long mMod;
  private final long mResidue;
  private Z[] mCounts = null;
  private long mN = -1;

  private static int[][] makeTransitions(final Graph g) {
    final int[][] t = new int[g.order()][];
    for (int k = 0; k < t.length; ++k) {
      t[k] = new int[(int) g.inDegree(k)];
      for (int j = 0, i = 0; j < t.length; ++j) {
        if (g.isAdjacent(j, k)) {
          t[k][i++] = j;
        }
      }
    }
    return t;
  }

  protected A377573(final int[][] transitions, final long mod, final long residue) {
    mTransitions = transitions;
    mMod = mod;
    mResidue = residue;
  }

  protected A377573(final Group<?> group, final long mod, final long residue) {
    this(makeTransitions(group.cayleyGraph()), mod, residue);
  }

//  protected A377573(final int[][] transitions) {
//    this(transitions, 1, 0);
//  }

  protected A377573(final Group<?> group) {
    this(group, 1, 0);
  }

  /** Construct the sequence. */
  public A377573() {
    this(GroupFactory.createGroup("D7"));
  }

  @Override
  public Z next() {
    while (true) {
      if (mCounts == null) {
        mCounts = new Z[mTransitions.length];
        Arrays.fill(mCounts, Z.ZERO);
        mCounts[0] = Z.ONE;
      } else {
        final Z[] c = new Z[mCounts.length];
        for (int k = 0; k < c.length; ++k) {
          Z s = Z.ZERO;
          for (final int t : mTransitions[k]) {
            s = s.add(mCounts[t]);
          }
          c[k] = s;
        }
        mCounts = c;
      }
      if (++mN % mMod == mResidue) {
        return mCounts[0];
      }
    }
  }

  /**
   * Generate the cogrowth sequence for a named group.
   * @param args group name
   */
  public static void main(final String[] args) {
    final long mod = args.length > 1 ? Long.parseLong(args[1]) : 1;
    final Sequence seq = new A377573(GroupFactory.createGroup(args[0]), mod, 0);
    while (true) {
      System.out.println(seq.next());
    }
  }
}

