package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048404 Primes with consecutive digits that differ exactly by 7.
 * @author Sean A. Irvine
 */
public class A048404 extends AbstractSequence {

  private final A048409 mSeq1 = new A048409();

  /** Construct the sequence. */
  public A048404() {
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
