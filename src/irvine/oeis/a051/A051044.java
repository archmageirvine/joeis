package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A051044 Odd values of the PartitionsQ function A000009.
 * @author Sean A. Irvine
 */
public class A051044 extends A000009 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isOdd()) {
        return t;
      }
    }
  }
}
