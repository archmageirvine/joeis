package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011855 <code>a(n) = floor(binomial(n,9)/9)</code>.
 * @author Sean A. Irvine
 */
public class A011855 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 9).divide(9);
  }
}
