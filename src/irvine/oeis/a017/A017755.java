package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017755.
 * @author Sean A. Irvine
 */
public class A017755 implements Sequence {

  private long mN = 90;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 91);
  }
}

