package irvine.oeis.a389;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083437.
 * @author Sean A. Irvine
 */
public class A389685 extends Sequence1 {

  private long mN = 0;

  // Collatz parity vector
  private static ArrayList<Integer> collatzParity(final long n) {
    final ArrayList<Integer> bits = new ArrayList<>();
    Z x = Z.valueOf(n);
    while (true) {
      bits.add(x.testBit(0) ? 1 : 0);
      if (x.isOne()) {
        // add two more bits for the 1 <-> 2 cycle
        bits.add(0);
        bits.add(1);
        return bits;
      }
      if (x.isEven()) {
        x = x.divide2();
      } else {
        x = x.multiply(3).add(1).divide2();
      }
    }
  }

  // Polynomial over F2
  private static Z t(final Z x) {
    if (x.isEven()) {
      return x.shiftRight(1);
    } else {
      // (x + 1 + q^2)/q
      return x.flipBit(0).flipBit(2).shiftRight(1);
    }
  }

  // Recover the H polynomial
  private static Z getH(final long n) {
    final ArrayList<Integer> parity = collatzParity(n);
    Z poly = Z.ZERO;
    for (int k = 0; k < parity.size(); ++k) {
      final int desiredParity = parity.get(k);
      Z t = poly;
      for (int i = 0; i < k; ++i) {
        t = t(t);
      }
      final int currentParity = t.isEven() ? 0 : 1;
      if (currentParity != desiredParity) {
        poly = poly.flipBit(k);
      }
    }
    return poly;
  }

  @Override
  public Z next() {
    return getH(++mN);
  }
}
