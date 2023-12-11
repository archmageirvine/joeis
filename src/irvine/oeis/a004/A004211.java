package irvine.oeis.a004;

import irvine.oeis.a000.A000085;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A004211 Shifts one place left under 2nd-order binomial transform.
 * @author Sean A. Irvine
 */
public class A004211 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A004211() {
    super(new A000085(), 0);
  }
}
