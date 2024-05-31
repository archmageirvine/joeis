package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A024171 Integer part of ((4th elementary symmetric function of 1,2,...,n)/(1+2+...+n)).
 * @author Sean A. Irvine
 */
public class A024171 extends A000217 {

  private long mN = 0;

  /** Construct the sequence. */
  public A024171() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      super.next();
      return Z.ZERO;
    }
    return Functions.STIRLING1.z(mN + 1, mN - 3).divide(super.next());
  }
}
