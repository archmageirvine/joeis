package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.RunLengthSequence;

/**
 * A030306.
 * @author Sean A. Irvine
 */
public class A030306 extends RunLengthSequence {

  /** Construct the sequence. */
  public A030306() {
    super(new A030302());
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next(); // skips runs of 0
    return res;
  }
}

