package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030174 Squares composed of digits {1,2,3}.
 * @author Sean A. Irvine
 */
public class A030174 extends A030175 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
