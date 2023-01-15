package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061009 a(n) = -2 + Sum_{j=1..n} (-(n-1)!) mod n.
 * @author Sean A. Irvine
 */
public class A061009 extends A061008 {

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
