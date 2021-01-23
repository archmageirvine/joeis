package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032152 Doubles (index 2+) under "CGJ" (necklace, element, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032152 extends A032151 {

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
