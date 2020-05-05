package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A031974 1 repeated <code>prime(n)</code> times.
 * @author Sean A. Irvine
 */
public class A031974 extends A000040 {

  @Override
  public Z next() {
    return new Z(StringUtils.rep('1', super.next().intValueExact()));
  }
}
