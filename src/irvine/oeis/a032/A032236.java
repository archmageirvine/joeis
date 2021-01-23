package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032236 Number of dyslexic rooted compound windmills with n nodes and leaves of 2 colors where any 2 submills extending from the same node are different.
 * @author Sean A. Irvine
 */
public class A032236 extends A032235 {

  @Override
  protected Z start() {
    return Z.TWO;
  }
}
