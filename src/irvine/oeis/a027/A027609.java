package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027609 Least non-partition into positive n-th powers.
 * @author Sean A. Irvine
 */
public class A027609 extends A027601 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
