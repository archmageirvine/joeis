package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;
import irvine.util.string.StringUtils;

/**
 * A135650 Even perfect numbers written in base 2.
 * @author Georg Fischer
 */
public class A135650 extends A000043 {

  @Override
  public Z next() {
    final int len = super.next().intValue();
    return new Z(StringUtils.rep('1', len) + StringUtils.rep('0', len - 1));
  }
}
