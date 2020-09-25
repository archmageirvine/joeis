package irvine.oeis.a035;

import irvine.oeis.PrependSequence;
import irvine.oeis.WeighTransformSequence;
import irvine.oeis.a000.A000220;

/**
 * A035056 Number of asymmetric forests with n nodes.
 * @author Sean A. Irvine
 */
public class A035056 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A035056() {
    super(new PrependSequence(new A000220(), 0));
  }
}
