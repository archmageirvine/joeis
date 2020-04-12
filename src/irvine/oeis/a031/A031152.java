package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031152 Squares composed of digits <code>{2,4,5}</code>.
 * @author Sean A. Irvine
 */
public class A031152 extends A031154 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
