package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.RunLengthSequence;

/**
 * A030329 Length of n-th run of 1's in A030324.
 * @author Sean A. Irvine
 */
public class A030329 extends RunLengthSequence {

  /** Construct the sequence. */
  public A030329() {
    super(new A030324());
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}

