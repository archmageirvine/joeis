package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030722 Numbers n such that <code>s(n)&gt;s(j)</code> for <code>j=1,2,...,n-1</code>, where <code>s=A030717</code> (with <code>s(0)=0)</code>.
 * @author Sean A. Irvine
 */
public class A030722 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030722() {
    super(new A030717(), 1);
  }
}
