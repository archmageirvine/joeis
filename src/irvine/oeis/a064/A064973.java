package irvine.oeis.a064;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a065.A065358;

/**
 * A064973 Values for which A065358 is larger than any preceding term.
 * @author Sean A. Irvine
 */
public class A064973 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A064973() {
    super(1, new A065358().skip(), 1);
  }
}

