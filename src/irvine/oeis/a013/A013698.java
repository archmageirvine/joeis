package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013698.
 * @author Sean A. Irvine
 */
public class A013698 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN + 2, mN - 1);
  }
}
