package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032227 Doubles (index <code>2+)</code> under "DGJ" <code>(bracelet</code>, element, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032227 extends A032226 {

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
