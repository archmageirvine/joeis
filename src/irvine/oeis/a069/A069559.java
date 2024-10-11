package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A069559 Triangular numbers in which the k-th significant digit either divides k or is a multiple of k.
 * @author Sean A. Irvine
 */
public class A069559 extends Sequence1 {

  private final Sequence mA;

  protected A069559(final Sequence seq) {
    mA = seq;
  }

  /** Construct the sequence. */
  public A069559() {
    this(new A000217().skip());
  }

  private static boolean is(final Z n) {
    Z q = n;
    int k = 0;
    while (!q.isZero()) {
      ++k;
      final long d = q.mod(10);
      if (d == 0) {
        return false;
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
