package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.RunLengthSequence;

/**
 * A030322.
 * @author Sean A. Irvine
 */
public class A030322 extends RunLengthSequence {

  /** Construct the sequence. */
  public A030322() {
    super(new A030317());
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}

