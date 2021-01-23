package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010973 a(n) = binomial(n,20).
 * @author Sean A. Irvine
 */
public class A010973 implements Sequence {

  private long mN = 19;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 20);
  }
}

