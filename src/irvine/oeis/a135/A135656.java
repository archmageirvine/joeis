package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;
import irvine.util.string.StringUtils;

/**
 * A135656 Perfect numbers divided by 2, written in base 2.
 * The number of digits "1" is equal to A000043(n). The number of digits "0" is equal to A000043(n)-2.
 * @author Georg Fischer
 */
public class A135656 extends A000043 {

  private int mN = 0;

  @Override
  public Z next() {
    final int len = super.next().intValue();
    return new Z(StringUtils.rep('1', len) + StringUtils.rep('0', len < 2 ? 0 : len - 2));
  }
}
