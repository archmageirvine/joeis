package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030082 a(n) = prime^3 and digits of prime appear in a(n).
 * @author Sean A. Irvine
 */
public class A030082 extends A030080 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
