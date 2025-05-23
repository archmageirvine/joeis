package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011853 a(n) = floor( binomial(n,7)/7 ).
 * @author Sean A. Irvine
 */
public class A011853 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 7).divide(7);
  }
}
