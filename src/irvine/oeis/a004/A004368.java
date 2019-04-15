package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004368 Binomial coefficient <code>C(7n,n)</code>.
 * @author Sean A. Irvine
 */
public class A004368 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN);
  }
}

