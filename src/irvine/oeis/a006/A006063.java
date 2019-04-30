package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A006063 A card-arranging problem: values of n such that there exists a permutation p_1, <code>..</code>., p_n of <code>1, ..., n</code> such that <code>i +</code> p_i is a cube for every i.
 * @author Sean A. Irvine
 */
public class A006063 implements Sequence {

  // This is slow.

  private final LongDynamicBooleanArray mCubes = new LongDynamicBooleanArray();
  private int mN = 0;

  private boolean search(final boolean[] used, final int pos) {
    if (pos == used.length) {
      return true;
    }
    for (int k = 0; k < used.length; k++) {
      if (!used[k]) {
        final int v = k + pos + 2; // both k and pos are counting from 0
        if (mCubes.isSet(v)) {
          used[k] = true;
          final boolean res = search(used, pos + 1);
          used[k] = false;
          if (res) {
            return true;
          }
        }
      }
    }
    return false;
  }

//  private boolean permanent(final int n) {
//    final MatrixRing<Z> ring = new MatrixField<>(n, new GaloisField(2));
//    final Matrix<Z> mat = new DefaultMatrix<>(n, n, Z.ZERO);
//    for (int i = 0; i < n; i++) {
//      for (int j = 0; j <= i; j++) {
//        if (mCubes.isSet(i + j)) {
//          mat.set(i, j, Z.ONE);
//          mat.set(j, i, Z.ONE);
//        }
//      }
//    }
//    return ring.permanent(mat).signum() > 0;
//  }

  @Override
  public Z next() {
    while (true) {
      final boolean[] used = new boolean[++mN];
      mCubes.set(mN * mN * mN);
      //System.out.println(permanent(mN) + " perm");
      if (search(used, 0)) {
        return Z.valueOf(mN);
      }
    }
  }

}

