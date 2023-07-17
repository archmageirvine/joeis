package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002616 Reduced totient function (divided by 2).
 * @author Sean A. Irvine
 */
public class A002616 extends A002322 {

  /** Construct the sequence. */
  public A002616() {
    super(3);
  }

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
