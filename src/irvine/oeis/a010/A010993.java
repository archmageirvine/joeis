package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010993 Binomial coefficient <code>C(n,40)</code>.
 * @author Sean A. Irvine
 */
public class A010993 implements Sequence {

  private long mN = 39;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 40);
  }
}

