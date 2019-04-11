package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a001.A001792;

/**
 * A006589 <code>a(n) = (n+3)*2^n-1</code>.
 * @author Sean A. Irvine
 */
public class A006589 extends A001792 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
