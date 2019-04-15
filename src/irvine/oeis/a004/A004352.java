package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004352 Binomial coefficient <code>C(5n,n-10)</code>.
 * @author Sean A. Irvine
 */
public class A004352 implements Sequence {

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 10);
  }
}

