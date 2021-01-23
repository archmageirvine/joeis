package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010980 a(n) = binomial(n,27).
 * @author Sean A. Irvine
 */
public class A010980 implements Sequence {

  private long mN = 26;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 27);
  }
}

