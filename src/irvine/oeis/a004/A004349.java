package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004349 Binomial coefficient C(5n,n-7).
 * @author Sean A. Irvine
 */
public class A004349 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 7);
  }
}

