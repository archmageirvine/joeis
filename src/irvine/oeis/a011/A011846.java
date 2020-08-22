package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011846 a(n) = floor( binomial(n,9)/10 ).
 * @author Sean A. Irvine
 */
public class A011846 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 9).divide(10);
  }
}

