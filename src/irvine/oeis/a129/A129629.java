package irvine.oeis.a129;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a082.A082392;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A129629 Nonzero bisection of Moebius transform of A082392.
 * @author Georg Fischer
 */
public class A129629 extends AbstractSequence {

  private final MobiusTransformSequence mSeq1 = new MobiusTransformSequence(new A082392(), 0);

  /** Construct the sequence. */
  public A129629() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = mSeq1.next();
      if (!result.isZero()) {
        return result;
      }
    }
  }
}
