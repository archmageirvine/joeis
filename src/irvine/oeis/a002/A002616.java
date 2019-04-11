package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002616 Reduced totient function (divided by <code>2)</code>.
 * @author Sean A. Irvine
 */
public class A002616 extends A002322 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
