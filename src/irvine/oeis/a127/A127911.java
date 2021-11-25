package irvine.oeis.a127;
// manually euleras at 2021-11-24 08:46

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001372;
import irvine.oeis.a126.A126285;

/**
 * A127911 Number of nonisomorphic partial functional graphs with n points which are not functional graphs.
 * @author Georg Fischer
 */
public class A127911 extends A126285 {

  private final Sequence mA001372 = new A001372();

  @Override
  public Z next() {
    return super.next().subtract(mA001372.next());
  }
}
