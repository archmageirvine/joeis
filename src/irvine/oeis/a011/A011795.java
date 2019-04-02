package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011795 a(n) = floor(C(n,4)/5).
 * @author Sean A. Irvine
 */
public class A011795 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 4).divide(5);
  }
}
