package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017714.
 * @author Sean A. Irvine
 */
public class A017714 implements Sequence {

  private long mN = 49;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 50);
  }
}

