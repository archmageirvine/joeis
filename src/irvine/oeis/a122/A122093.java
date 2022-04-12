package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a114.A114426;

/**
 * A122093 Product of the first n 4-almost primes, divided by product of the first n primes, rounded down.
 * @author Georg Fischer
 */
public class A122093 extends A114426 {

  private final Sequence mSeq = new A002110();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return super.next().divide(mSeq.next());
  }
}
