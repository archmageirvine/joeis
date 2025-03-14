package irvine.oeis.a075;

import irvine.oeis.RecordPositionSequence;

/**
 * A075990 Numbers k such that A(k) &gt; A(h) for h=1,2,...,k-1, where A=A075988, with initial value a(1)=1.
 * @author Sean A. Irvine
 */
public class A075990 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A075990() {
    super(new A075988(), 1);
  }
}
