package irvine.oeis.a260;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a054.A054440;

/**
 * A260669 Number of unordered pairs of partitions of n with no common parts.
 * @author Georg Fischer
 */
public class A260669 extends A054440 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
