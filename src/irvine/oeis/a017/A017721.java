package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017721.
 * @author Sean A. Irvine
 */
public class A017721 implements Sequence {

  private long mN = 56;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 57);
  }
}

