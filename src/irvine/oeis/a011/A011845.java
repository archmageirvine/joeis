package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011845 a(n) = floor( binomial(n,8)/9).
 * @author Sean A. Irvine
 */
public class A011845 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 8).divide(9);
  }
}

