package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A081941 a(1) = 1; for n&gt;1, a(n)= smallest number greater than the previous term such that a(n-1)*a(n) + 1 is a palindrome.
 * @author Sean A. Irvine
 */
public class A081941 extends Sequence1 {

  private final Sequence mP = new A002113().skip(3);
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (true) {
        final Z palin = mP.next();
        final Z[] qr = palin.subtract(1).divideAndRemainder(mA);
        if (qr[1].isZero() && qr[0].compareTo(mA) > 0) {
          mA = qr[0];
          break;
        }
      }
    }
    return mA;
  }
}
