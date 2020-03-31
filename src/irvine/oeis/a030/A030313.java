package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.RunLengthSequence;

/**
 * A030313.
 * @author Sean A. Irvine
 */
public class A030313 extends RunLengthSequence {

  /** Construct the sequence. */
  public A030313() {
    super(new A030308());
  }

  @Override
  public Z next() {
    super.next(); // skips runs of 0
    return super.next();
  }
}

