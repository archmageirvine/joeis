package irvine.oeis.a053;
// manually 2021-12-29

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A053668 Product of digits of n^3.
 * @author Georg Fischer
 */
public class A053668 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ZUtils.digitProduct(Z.valueOf(mN).multiply(mN).multiply(mN));
  }
}
