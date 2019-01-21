package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017737.
 * @author Sean A. Irvine
 */
public class A017737 implements Sequence {

  private long mN = 72;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 73);
  }
}

