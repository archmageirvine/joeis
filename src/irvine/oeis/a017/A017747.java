package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017747.
 * @author Sean A. Irvine
 */
public class A017747 implements Sequence {

  private long mN = 82;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 83);
  }
}

