package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;
import irvine.util.string.StringUtils;

/**
 * A135651 Even superperfect numbers written in base 2.
 * @author Georg Fischer
 */
public class A135651 extends A000043 {

  private int mN = 0;

  @Override
  public Z next() {
    final int len = super.next().intValue();
    return new Z("1" + StringUtils.rep('0', len - 1));
  }
}
