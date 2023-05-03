package irvine.oeis.a063;

import irvine.oeis.RecordPositionSubsequence;
import irvine.oeis.a000.A000503;

/**
 * A063537 Numbers k such that floor(tan(k)) &gt; floor(tan(m)) for all m &lt; k.
 * @author Sean A. Irvine
 */
public class A063537 extends RecordPositionSubsequence {

  /** Construct the sequence. */
  public A063537() {
    super(0, new A000503());
    next();
  }
}
