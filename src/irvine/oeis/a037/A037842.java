package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.util.string.StringUtils;

/**
 * A037842 Fibonacci numbers in base 1.
 * @author Sean A. Irvine
 */
public class A037842 extends A000045 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return new Z(StringUtils.rep('1', super.next().intValueExact()));
  }
}
