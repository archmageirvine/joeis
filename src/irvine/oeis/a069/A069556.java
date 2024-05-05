package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069556 extends Sequence1 {

  private final Sequence mA;

  protected A069556(final Sequence seq) {
    mA = seq;
  }

  /** Construct the sequence. */
  public A069556() {
    this(new A000040());
  }

  private static boolean is(final Z n) {
    Z q = n;
    int k = 0;
    while (!q.isZero()) {
      ++k;
      final long d = q.mod(10);
      if (d == 0) {
        return false;
      } else if (d == 1) {
        if ((k & 1) == 0 || k % 3 == 0 || k % 5 == 0 || k % 7 == 0) {
          return false;
        }
      } else if (d % k != 0 && k % d != 0) {
        return false;
      }
      q = q.divide(10);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = mA.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
