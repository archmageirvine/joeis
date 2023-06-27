package irvine.oeis.a064;

import irvine.oeis.InverseSequence;

/**
 * A064292 Term at which first number of height n occurs in Recam\u00e1n's sequence A005132.
 * @author Sean A. Irvine
 */
public class A064292 extends InverseSequence {

  /** Construct the sequence. */
  public A064292() {
    super(0, new A064289(), 0, 0);
  }
}
