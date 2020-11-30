package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036897 Square root of odd refactorable numbers.
 * @author Sean A. Irvine
 */
public class A036897 extends A036896 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
