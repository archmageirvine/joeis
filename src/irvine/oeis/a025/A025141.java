package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025141 a(n) = (k-1)st elementary symmetric function of C(n,0), C(n,1), ..., C(n,k), where k = floor( n/2 ).
 * @author Sean A. Irvine
 */
public class A025141 extends A025134 {

  /** Construct the sequence. */
  public A025141() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return sym(Z.ONE, 0, ++mN / 2, mN, mN / 2 - 1);
  }
}
