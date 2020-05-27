package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032163 Number of series-reduced planted compound windmills with n leaves of 2 colors where any 2 submills extending from the same node are different.
 * @author Sean A. Irvine
 */
public class A032163 extends A032160 {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.TWO;
    }
    add(Z.ZERO);
    final Z t = super.computeNext();
    remove(n);
    return t;
  }
}
