package irvine.oeis.a277;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A277827 Digits that appear twice consecutively in the decimal expansion of Pi, in order of appearance.
 * @author Georg Fischer
 */
public class A277827 extends A000796 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z s = mA;
      mA = super.next();
      if (s.equals(mA)) {
        return s;
      }
    }
  }
}
