package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010984 Binomial coefficient <code>C(n,31)</code>.
 * @author Sean A. Irvine
 */
public class A010984 implements Sequence {

  private long mN = 30;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 31);
  }
}

