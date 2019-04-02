package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004346 Binomial coefficient C(5n,n-4).
 * @author Sean A. Irvine
 */
public class A004346 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 4);
  }
}

