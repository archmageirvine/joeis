package irvine.oeis.a065;

import irvine.oeis.RecordSequence;
import irvine.oeis.a062.A062402;

/**
 * A065390 Peak values reached by A062402 at the sites listed in A065389.
 * @author Sean A. Irvine
 */
public class A065390 extends RecordSequence {

  /** Construct the sequence. */
  public A065390() {
    super(new A062402());
  }
}
