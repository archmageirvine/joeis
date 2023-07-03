package irvine.oeis.a060;

import irvine.oeis.RecordPositionSequence;

/**
 * A060424 Record-setting n's for the function q(n), the minimum prime q such that n(q+1)-1 is prime p (i.e., q(n) &gt; q(j) for all 0 &lt; j &lt; n).
 * @author Sean A. Irvine
 */
public class A060424 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A060424() {
    super(1, new A060324(), 1);
  }
}
