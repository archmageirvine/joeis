package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017729 Binomial coefficients C(n,65).
 * @author Sean A. Irvine
 */
public class A017729 implements Sequence {

  private long mN = 64;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 65);
  }
}

