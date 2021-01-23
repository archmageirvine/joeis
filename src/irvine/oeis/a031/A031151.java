package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031151 Squares composed of digits {1,2,5}.
 * @author Sean A. Irvine
 */
public class A031151 extends A031153 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
