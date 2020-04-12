package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A031157 Numbers that are both lucky and prime.
 * @author Sean A. Irvine
 */
public class A031157 extends A000959 {

  @Override
  public Z next() {
    while (true) {
      final Z candidate = super.next();
      if (candidate.isProbablePrime()) {
        return candidate;
      }
    }
  }
}
