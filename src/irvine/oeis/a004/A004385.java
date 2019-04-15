package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004385 Binomial coefficient <code>C(8n,n-4)</code>.
 * @author Sean A. Irvine
 */
public class A004385 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 4);
  }
}

