package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017750.
 * @author Sean A. Irvine
 */
public class A017750 implements Sequence {

  private long mN = 85;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 86);
  }
}

