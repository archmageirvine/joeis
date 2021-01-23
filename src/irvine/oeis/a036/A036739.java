package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036739 a(n) = (n!)^n+1.
 * @author Sean A. Irvine
 */
public class A036739 extends A036740 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

