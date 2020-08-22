package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034293 Numbers n such that <code>2^n</code> does not contain the digit <code>2</code> (probably finite).
 * @author Sean A. Irvine
 */
public class A034293 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    outer:
    while (true) {
      Z t = Z.ONE.shiftLeft(++mN);
      while (!Z.ZERO.equals(t)) {
        final Z[] qr = t.divideAndRemainder(Z.TEN);
        if (Z.TWO.equals(qr[1])) {
          continue outer;
        }
        t = qr[0];
      }
      return Z.valueOf(mN);
    }
  }
}

