package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011848 <code>a(n) = floor(binomial(n,2)/2)</code>.
 * @author Sean A. Irvine
 */
public class A011848 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 2).divide(2);
  }
}
