package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000262;

/**
 * A006152 Exponential generating function x*exp(x/(1-x)).
 * @author Sean A. Irvine
 */
public class A006152 extends A000262 {

  /** Construct the sequence. */
  public A006152() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}

