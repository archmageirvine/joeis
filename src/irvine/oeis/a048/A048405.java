package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048405 Primes with consecutive digits that differ exactly by 8.
 * @author Sean A. Irvine
 */
public class A048405 extends AbstractSequence {

  private final A048410 mSeq1 = new A048410();

  /** Construct the sequence. */
  public A048405() {
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
