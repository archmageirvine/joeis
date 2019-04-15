package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004392 Binomial coefficient <code>C(8n,n-11)</code>.
 * @author Sean A. Irvine
 */
public class A004392 implements Sequence {

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 11);
  }
}

