package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004377 Binomial coefficient <code>C(7n,n-9)</code>.
 * @author Sean A. Irvine
 */
public class A004377 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 9);
  }
}

