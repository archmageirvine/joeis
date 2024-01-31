package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A068148 Primes in which neighboring digits differ at most by 1.
 * @author Sean A. Irvine
 */
public class A068148 extends Sequence1 {

  private final Sequence mSeq;

  protected A068148(final Sequence seq) {
    mSeq = seq;
  }

  /** Construct the sequence. */
  public A068148() {
    this(new A000040());
  }

  private boolean is(Z p) {
    long a = p.mod(10);
    p = p.divide(10);
    while (!p.isZero()) {
      final long b = a;
      a = p.mod(10);
      final long d = Math.abs(a - b);
      if (d > 1 && d != 9) {
        return false;
      }
      p = p.divide(10);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = mSeq.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
