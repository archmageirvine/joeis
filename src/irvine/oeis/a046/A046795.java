package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046795 Geometric and harmonic means of a(n) and A046794(n) both integers.
 * @author Sean A. Irvine
 */
public class A046795 extends A046794 {

  @Override
  protected Z select(final long n, final long k) {
    return Z.valueOf(k);
  }
}

