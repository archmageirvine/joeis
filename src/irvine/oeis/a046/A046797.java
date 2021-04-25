package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046797 Arithmetic, geometric and harmonic means of a(n) and A046796(n) all integers.
 * @author Sean A. Irvine
 */
public class A046797 extends A046796 {

  @Override
  protected Z select(final long n, final long k) {
    return Z.valueOf(k);
  }
}

