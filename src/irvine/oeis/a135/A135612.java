package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;
import irvine.util.string.StringUtils;

/**
 * A135612 Even superperfect numbers divided by 2, written in base 2.
 * Concatenation of "1" and A000043(n)-2 digits "0".
 * @author Georg Fischer
 */
public class A135612 extends A000043 {

  @Override
  public Z next() {
    return new Z("1" + StringUtils.rep('0', super.next().intValue() - 2));
  }
}
