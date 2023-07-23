package irvine.oeis.a354;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A354542 Primes in A354543.
 * @author Georg Fischer
 */
public class A354542 extends AbstractSequence {

  private final A354543 mSeq1 = new A354543();

  /** Construct the sequence. */
  public A354542() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = mSeq1.next();
      if (result.isProbablePrime()) {
        return result;
      }
    }
  }
}
