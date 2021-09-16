package irvine.oeis.a051;

import irvine.oeis.RunLengthSequence;
import irvine.oeis.a004.A004593;

/**
 * A051482 Run lengths in binary expansion of e.
 * @author Sean A. Irvine
 */
public class A051482 extends RunLengthSequence {

  /** Construct the sequence. */
  public A051482() {
    super(new A004593());
  }
}
