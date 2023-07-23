package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A055026 Number of Gaussian primes of successive norms (indexed by A055025).
 * @author Sean A. Irvine
 */
public class A055026 extends AbstractSequence {

  private final A055028 mSeq1 = new A055028();

  /** Construct the sequence. */
  public A055026() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (!t.isZero()) {
        return t;
      }
    }
  }
}
