package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002180 Values taken by the half-totient function phi(m)/2.
 * @author Sean A. Irvine
 */
public class A002180 extends A002202 {

  /** Construct the sequence. */
  public A002180() {
    super(2);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
