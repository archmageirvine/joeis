package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000346.
 * @author Sean A. Irvine
 */
public class A000346 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final int t = 2 * ++mN + 1;
    return Z.ONE.shiftLeft(t).subtract(Binomial.binomial(t, mN + 1));
  }
}
