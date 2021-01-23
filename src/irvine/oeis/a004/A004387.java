package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004387 Binomial coefficient C(8n,n-6).
 * @author Sean A. Irvine
 */
public class A004387 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 6);
  }
}

