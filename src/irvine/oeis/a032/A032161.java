package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032161 Number of rooted compound windmills with n nodes and leaves of 2 colors where any 2 submills extending from the same node are different.
 * @author Sean A. Irvine
 */
public class A032161 extends A032160 {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.TWO;
    }
    return super.computeNext();
  }
}
