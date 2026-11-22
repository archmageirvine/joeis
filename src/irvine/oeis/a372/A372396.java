package irvine.oeis.a372;

import java.util.ArrayList;
import java.util.Collections;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a212.A212084;

/**
 * A372396 Triangle T(n,k) in which row n lists in increasing order the number of acyclic orientations of complete multipartite graphs K_lambda, where lambda is a partition of n; triangle T(n,k), n&gt;=0, k = 1..A000041(n), read by rows.
 * @author Gregory Morse
 */
public class A372396 extends A212084 {
  private final boolean mDistinct;
  private int mN = -1;
  private int mK = 0;
  private ArrayList<Z> mRow = new ArrayList<>();

  protected A372396(final boolean distinct) {
    mDistinct = distinct;
  }

  /** Construct the sequence. */
  public A372396() {
    this(false);
  }

  private static boolean distinct(final int[] p) {
    for (int k = 1; k < p.length; ++k) {
      if (p[k] == p[k - 1]) {
        return false;
      }
    }
    return true;
  }

  protected final ArrayList<Z> row(final int n) {
    final ArrayList<Z> row = new ArrayList<>();
    final IntegerPartition partitions = new IntegerPartition(n);
    int[] p;
    while ((p = partitions.next()) != null) {
      if (!mDistinct || distinct(p)) {
        row.add(orientations(p));
      }
    }
    Collections.sort(row);
    return row;
  }

  @Override
  public Z next() {
    if (++mK >= mRow.size()) {
      mRow = row(++mN);
      mK = 0;
    }
    return mRow.get(mK);
  }
}
