package irvine.oeis.a028;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028303 a(n) = floor( binomial(n, floor(n/2))/(1 + ceiling(n/2)) ) (interpolates between Catalan numbers).
 * @author Sean A. Irvine
 */
public class A028303 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, mN / 2).divide((mN + 1) / 2 + 1);
  }
}

