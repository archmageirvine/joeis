package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.RunLengthSequence;

/**
 * A030321 Length of n-th run of 0's in A030317.
 * @author Sean A. Irvine
 */
public class A030321 extends RunLengthSequence {

  /** Construct the sequence. */
  public A030321() {
    super(new A030317());
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

