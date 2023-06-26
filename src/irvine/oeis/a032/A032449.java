package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A032449 Every suffix is prime and no digit is 0 or 5.
 * @author Sean A. Irvine
 */
public class A032449 extends FiniteSequence {

  private static void build(final TreeSet<Z> res, final Z p) {
    res.add(p);
    final String ps = p.toString();
    for (int digit = 1; digit <= 9; ++digit) {
      if (digit != 5) {
        final Z candidate = new Z(digit + ps);
        if (candidate.isProbablePrime()) {
          build(res, candidate);
        }
      }
    }
  }

  private static TreeSet<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    build(res, Z.TWO);
    build(res, Z.THREE);
    build(res, Z.SEVEN);
    return res;
  }

  /** Construct the sequence. */
  public A032449() {
    super(1, FINITE, build());
  }
}
