package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010976 Binomial coefficient <code>C(n,23)</code>.
 * @author Sean A. Irvine
 */
public class A010976 implements Sequence {

  private long mN = 22;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 23);
  }
}

