package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001288.
 * @author Sean A. Irvine
 */
public class A001288 implements Sequence {

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 11);
  }
}
