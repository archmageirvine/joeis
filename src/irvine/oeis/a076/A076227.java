package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076227 Number of surviving Collatz residues mod 2^n.
 * @author Sean A. Irvine
 */
public class A076227 extends Sequence0 {

  // After Phil Carmody

  private int mN = -1;

  private Z survives(Z r, Z m, final Z lm, final int p2, final int fp2) {
    while (m.isEven() && m.compareTo(lm) >= 0) {
      if (r.isOdd()) {
        r = r.add(r.add(1).divide2());
        m = m.add(m.divide2());
      } else {
        r = r.divide2();
        m = m.divide2();
      }
    }
    if (m.compareTo(lm) < 0) {
      return Z.ZERO;
    }
    if (p2 == fp2) {
      return Z.ONE;
    }
    return survives(r, m.multiply2(), lm.multiply2(), p2 + 1, fp2)
      .add(survives(r.add(m), m.multiply2(), lm.multiply2(), p2 + 1, fp2));
  }

  @Override
  public Z next() {
    return survives(Z.ZERO, Z.ONE, Z.ONE, 0, ++mN);
  }
}
