package irvine.oeis.a122;
// manually partprom/partprod at 2022-04-12 12:36

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;

/**
 * A122609 Product of the first n 5-almost primes (A014614), divided by product of the first n primes, rounded down.
 * @author Georg Fischer
 */
public class A122609 extends A122123 {

  private final Sequence mSeq = new A002110();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return super.next().divide(mSeq.next());
  }
}
