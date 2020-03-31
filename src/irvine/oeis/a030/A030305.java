package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.RunLengthSequence;

/**
 * A030305.
 * @author Sean A. Irvine
 */
public class A030305 extends RunLengthSequence {

  /** Construct the sequence. */
  public A030305() {
    super(new A030302());
  }

  @Override
  public Z next() {
    super.next(); // skips runs of 1
    return super.next();
  }
}

