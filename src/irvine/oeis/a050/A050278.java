package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A050278 Pandigital numbers: numbers containing the digits 0-9. Version 1: each digit appears exactly once.
 * @author Sean A. Irvine
 */
public class A050278 implements Sequence {

  private final Permutation mPerm = new Permutation(new int[] {1, 0, 2, 3, 4, 5, 6, 7, 8, 9}, false);

  @Override
  public Z next() {
    final int[] p = mPerm.next();
    if (p == null) {
      return null;
    }
    long prod = 0;
    for (final int v : p) {
      prod *= 10;
      prod += v;
    }
    return Z.valueOf(prod);
  }
}

