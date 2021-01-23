package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038003 Odd Catalan numbers; more precisely, A000108(2^n-1).
 * @author Sean A. Irvine
 */
public class A038003 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.catalan((1L << ++mN) - 1);
  }
}
