package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014321 The next new gap between successive odd primes (divided by <code>2)</code>.
 * @author Sean A. Irvine
 */
public class A014321 extends A014320 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

