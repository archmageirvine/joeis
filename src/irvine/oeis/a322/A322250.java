package irvine.oeis.a322;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.a000.A000265;

/**
 * A322250 Take binary expansion of 2n-1 and delete the trailing block of 1&apos;s, except if the number is 11...1, leave a single 1.
 * @author Georg Fischer
 */
public class A322250 extends A000265 {
  @Override
  public Z next() {
    Z result = super.next().subtract(1);
    if (result.isZero()) {
      result = Z.ONE;
    }
    return result;
  }
}
