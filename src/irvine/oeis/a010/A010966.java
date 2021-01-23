package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010966 a(n) = binomial(n,13).
 * @author Sean A. Irvine
 */
public class A010966 implements Sequence {

  private long mN = 12;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 13);
  }
}

