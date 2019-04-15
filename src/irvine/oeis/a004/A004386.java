package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004386 Binomial coefficient <code>C(8n,n-5)</code>.
 * @author Sean A. Irvine
 */
public class A004386 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 5);
  }
}

