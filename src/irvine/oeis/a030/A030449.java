package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a005.A005345;

/**
 * A030449 Number of elements in the free band (idempotent semigroup) on n generators.
 * @author Sean A. Irvine
 */
public class A030449 extends A005345 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
