package irvine.oeis.a026;

import irvine.oeis.RecordPositionSequence;

/**
 * A026179 a(n) = n-th number k such that s(j) &lt; s(k) for all j &lt; k, where s = A026177.
 * @author Sean A. Irvine
 */
public class A026179 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A026179() {
    super(new A026177(), 1);
  }
}
