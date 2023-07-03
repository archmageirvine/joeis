package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.base.RunLengthSequence;

/**
 * A030313 Length of n-th run of 1's in A030308.
 * @author Sean A. Irvine
 */
public class A030313 extends RunLengthSequence {

  /** Construct the sequence. */
  public A030313() {
    super(1, new A030308());
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

