package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068048 Length of the n-th nontrivial palindrome in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A068048 extends A068046 {

  @Override
  protected Z select(final int length, final Z value, final long start) {
    return Z.valueOf(length);
  }
}

