package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010982 Binomial coefficient C(n,29).
 * @author Sean A. Irvine
 */
public class A010982 implements Sequence {

  private long mN = 28;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 29);
  }
}

