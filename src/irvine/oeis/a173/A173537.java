package irvine.oeis.a173;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;

/**
 * A173537 a(n) = A173522(n)/2.
 * @author Georg Fischer
 */
public class A173537 extends A173522 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
