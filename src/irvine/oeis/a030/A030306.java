package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.base.RunLengthSequence;

/**
 * A030306 Length of n-th run of 1's in A030302.
 * @author Sean A. Irvine
 */
public class A030306 extends RunLengthSequence {

  /** Construct the sequence. */
  public A030306() {
    super(1, new A030302());
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next(); // skips runs of 0
    return res;
  }
}

