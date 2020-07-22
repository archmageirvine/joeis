package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033884 Deficiency of n-th deficient number: <code>2k - sigma(k)</code> for k such that this is <code>&gt; 0</code>.
 * @author Sean A. Irvine
 */
public class A033884 extends A033879 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.signum() > 0) {
        return a;
      }
    }
  }
}
