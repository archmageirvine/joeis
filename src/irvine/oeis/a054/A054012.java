package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054012 Nonzero values of n read modulo (number of proper divisors of n).
 * @author Sean A. Irvine
 */
public class A054012 extends A054009 {

  /** Construct the sequence. */
  public A054012() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isZero()) {
        return t;
      }
    }
  }
}
