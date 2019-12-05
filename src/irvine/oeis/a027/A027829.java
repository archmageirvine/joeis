package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a016.A016113;

/**
 * A027829 Palindromic squares with an even number of digits.
 * @author Sean A. Irvine
 */
public class A027829 extends A016113 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
