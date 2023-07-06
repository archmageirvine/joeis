package irvine.oeis.a060;

import irvine.oeis.InverseSequence;
import irvine.oeis.a035.A035485;

/**
 * A060750 Step at which card n appears on top of deck for first time in Guy's shuffling problem A035485.
 * @author Sean A. Irvine
 */
public class A060750 extends InverseSequence {

  /** Construct the sequence. */
  public A060750() {
    super(new A035485().skip(1), 1, 1);
  }
}
