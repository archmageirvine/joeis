package irvine.oeis.a094;
// manually robots/union2 at 2023-08-15 15:43

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a023.A023200;
import irvine.oeis.a046.A046132;

/**
 * A094343 List of pairs of primes (p, q) with q - p = 4.
 * @author Georg Fischer
 */
public class A094343 extends Sequence1 {

  private int mN = 0;
  private final A023200 mSeq1 = new A023200();
  private final A046132 mSeq2 = new A046132();

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? mSeq1.next() : mSeq2.next();
  }
}
