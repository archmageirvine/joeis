package irvine.oeis.a063;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a054.A054673;

/**
 * A063771 Numbers n such that n^sin(n) &gt; m^sin(m) for all m &lt; n and n^sin(n) is rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A063771 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A063771() {
    super(1, new SkipSequence(new A054673(), 1), 1);
  }
}
