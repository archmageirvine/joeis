package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004376 Binomial coefficient <code>C(7n,n-8)</code>.
 * @author Sean A. Irvine
 */
public class A004376 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 8);
  }
}

