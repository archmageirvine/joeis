package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048402 Primes with consecutive digits that differ exactly by 5.
 * @author Sean A. Irvine
 */
public class A048402 extends AbstractSequence {

  private final A048407 mSeq1 = new A048407();

  /** Construct the sequence. */
  public A048402() {
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
