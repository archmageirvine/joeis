package irvine.oeis.a051;

import irvine.oeis.RunLengthSequence;
import irvine.oeis.a004.A004601;

/**
 * A051480 Run lengths in binary expansion of Pi.
 * @author Sean A. Irvine
 */
public class A051480 extends RunLengthSequence {

  /** Construct the sequence. */
  public A051480() {
    super(new A004601());
  }
}
