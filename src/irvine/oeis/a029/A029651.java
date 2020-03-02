package irvine.oeis.a029;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029651 Central elements of the <code>(1,2)-Pascal</code> triangle <code>A029635</code>.
 * @author Sean A. Irvine
 */
public class A029651 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Binomial.binomial(2 * mN - 1, mN).multiply(3);
  }
}
