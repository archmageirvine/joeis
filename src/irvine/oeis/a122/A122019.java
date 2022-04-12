package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a112.A112141;

/**
 * A122019 Product of the first n semiprimes, divided by product of the first n primes, rounded down.
 * @author Georg Fischer
 */
public class A122019 extends A112141 {

  private final Sequence mSeq = new A002110();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return super.next().divide(mSeq.next());
  }
}
