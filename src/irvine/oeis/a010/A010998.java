package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010998 a(n) = binomial coefficient C(n,45).
 * @author Sean A. Irvine
 */
public class A010998 implements Sequence {

  private long mN = 44;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 45);
  }
}

