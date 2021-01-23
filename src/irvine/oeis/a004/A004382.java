package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004382 Binomial coefficient C(8n, n-1).
 * @author Sean A. Irvine
 */
public class A004382 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 1);
  }
}

