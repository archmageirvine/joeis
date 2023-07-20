package irvine.oeis.a063;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a000.A000503;

/**
 * A063537 Numbers k such that floor(tan(k)) &gt; floor(tan(m)) for all m &lt; k.
 * @author Sean A. Irvine
 */
public class A063537 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A063537() {
    super(new A000503(), 0, false);
    next();
  }
}
