package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000580 <code>a(n) =</code> binomial coefficient C(n,7).
 * @author Sean A. Irvine
 */
public class A000580 implements Sequence {

  private int mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 7);
  }
}

