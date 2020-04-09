package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030762 Numbers n such that <code>s(n)&gt;s(j)</code> for <code>j=1,2,...,n-1</code>, where <code>s=A030757</code> (with <code>s(0)=0)</code>.
 * @author Sean A. Irvine
 */
public class A030762 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030762() {
    super(new A030757(), 1);
  }
}
