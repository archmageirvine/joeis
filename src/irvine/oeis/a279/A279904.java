package irvine.oeis.a279;
// manually 2026-10-04/adjext at 2026-10-04 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a058.A058781;

/**
 * A279904 Primes of the form n^2*2^n - 1.
 * @author Georg Fischer
 */
public class A279904 extends AbstractSequence {

  private final Sequence mSeq = new A058781();

  /** Construct the sequence */
  public A279904() {
    super(1);
  }

  @Override
  public Z next() {
    final Z n = mSeq.next();
    return n.square().multiply(Z.TWO.pow(n)).subtract(1);
  }
}
