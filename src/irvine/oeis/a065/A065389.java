package irvine.oeis.a065;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a062.A062402;

/**
 * A065389 Numbers n such that sigma(phi(n)) sets a new record, i.e., sigma(phi(m)) &gt; sigma(phi(k)) for all k &lt; m numbers.
 * @author Sean A. Irvine
 */
public class A065389 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A065389() {
    super(new A062402(), 1);
  }
}
