package irvine.oeis.a004;

import irvine.oeis.transform.Stirling2TransformSequence;
import irvine.oeis.a000.A000165;

/**
 * A004123 Number of generalized weak orders on n points.
 * @author Sean A. Irvine
 */
public class A004123 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A004123() {
    super(new A000165(), 0);
  }
}
