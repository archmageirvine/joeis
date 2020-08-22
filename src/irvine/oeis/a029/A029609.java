package irvine.oeis.a029;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029609 Central numbers in the (2,3)-Pascal triangle A029600.
 * @author Sean A. Irvine
 */
public class A029609 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Binomial.binomial(2 * mN, mN).divide2().multiply(5);
  }
}
