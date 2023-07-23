package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048401 Primes with consecutive digits that differ exactly by 4.
 * @author Sean A. Irvine
 */
public class A048401 extends AbstractSequence {

  private final A048406 mSeq1 = new A048406();

  /** Construct the sequence. */
  public A048401() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
