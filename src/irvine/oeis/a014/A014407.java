package irvine.oeis.a014;

import irvine.oeis.RecordPositionSequence;

/**
 * A014407 <code>a(n) =</code> n-th number k such that s(j) &lt; s(k) for all j &lt; k, where s = A014405.
 * @author Sean A. Irvine
 */
public class A014407 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A014407() {
    super(new A014405(), 1);
  }
}
