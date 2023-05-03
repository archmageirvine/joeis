package irvine.oeis.a132;
// manually n3 at 2023-05-02 19:56

import irvine.math.z.Z;
import irvine.oeis.a051.A051652;

/**
 * A132861 Smallest number at distance 3n from nearest prime (variant 2).
 * @author Georg Fischer
 */
public class A132861 extends A051652 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
