package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000973.
 * @author Sean A. Irvine
 */
public class A000973 implements Sequence {

  private long mN = 14;

  @Override
  public Z next() {
    mN += 2;
    return Binomial.binomial(mN - 8, 7).divide(8);
  }
}
