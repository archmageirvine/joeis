package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A059833 "Madonna's Sequence": add 1 (mod 10) to each digit of Pi.
 * @author Georg Fischer
 */
public class A059833 extends A000796 {

  @Override
  public Z next() {
    final Z result = super.next().add(1);
    return result.compareTo(Z.TEN) < 0 ? result : Z.ZERO;
  }
}
