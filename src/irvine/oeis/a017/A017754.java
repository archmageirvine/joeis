package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017754.
 * @author Sean A. Irvine
 */
public class A017754 implements Sequence {

  private long mN = 89;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 90);
  }
}

