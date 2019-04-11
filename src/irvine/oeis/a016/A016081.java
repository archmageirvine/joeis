package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A016081 Add <code>4,</code> then reverse digits!.
 * @author Sean A. Irvine
 */
public class A016081 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : ZUtils.reverse(mA.add(4));
    return mA;
  }
}
