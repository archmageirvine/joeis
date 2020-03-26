package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030176 Squares composed of digits <code>{4,5,6}</code>.
 * @author Sean A. Irvine
 */
public class A030176 extends A030177 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
