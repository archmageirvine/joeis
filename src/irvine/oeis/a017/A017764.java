package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017764.
 * @author Sean A. Irvine
 */
public class A017764 implements Sequence {

  private long mN = 99;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 100);
  }
}

