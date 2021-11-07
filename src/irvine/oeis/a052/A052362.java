package irvine.oeis.a052;

import irvine.oeis.RecordPositionSequence;

/**
 * A052362 Indices of records in length of English name of n including spaces and dashes (A052360): n such that k &lt; n =&gt; A052360(k) &lt; A052360(n).
 * @author Sean A. Irvine
 */
public class A052362 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A052362() {
    super(new A052360(), 0);
  }
}
