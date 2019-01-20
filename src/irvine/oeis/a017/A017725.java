package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017725.
 * @author Sean A. Irvine
 */
public class A017725 implements Sequence {

  private long mN = 60;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 61);
  }
}

