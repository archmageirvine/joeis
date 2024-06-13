package irvine.oeis.a070;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a004.A004086;

/**
 * A070698 Numbers n such that reverse(n) sets a record (that is, n such that reverse(n) &gt; reverse(k) for all k &lt; n).
 * @author Sean A. Irvine
 */
public class A070698 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A070698() {
    super(1, new A004086().skip(), 1);
  }
}
