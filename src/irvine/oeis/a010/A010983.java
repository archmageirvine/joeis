package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010983 Binomial coefficient C(n,30).
 * @author Sean A. Irvine
 */
public class A010983 implements Sequence {

  private long mN = 29;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 30);
  }
}

