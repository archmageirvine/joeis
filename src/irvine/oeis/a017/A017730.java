package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017730.
 * @author Sean A. Irvine
 */
public class A017730 implements Sequence {

  private long mN = 65;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 66);
  }
}

