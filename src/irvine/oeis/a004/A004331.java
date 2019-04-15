package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004331 Binomial coefficient <code>C(4n,n-1)</code>.
 * @author Sean A. Irvine
 */
public class A004331 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 1);
  }
}

