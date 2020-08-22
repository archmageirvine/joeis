package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004344 Binomial coefficient C(5n+10,n).
 * @author Sean A. Irvine
 */
public class A004344 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 2);
  }
}

