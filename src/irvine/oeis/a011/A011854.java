package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011854.
 * @author Sean A. Irvine
 */
public class A011854 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 8).divide(8);
  }
}
