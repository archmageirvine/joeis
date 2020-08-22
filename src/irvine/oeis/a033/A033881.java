package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033881 Abundancy of n-th abundant number: sigma(k) - 2k for k such that this is &gt; 0.
 * @author Sean A. Irvine
 */
public class A033881 extends A033880 {

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
