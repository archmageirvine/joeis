package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030742 Numbers n such that <code>s(n)&gt;s(j)</code> for <code>j=1,2,...,n-1</code>, where <code>s=A030737</code> (with <code>s(0)=0)</code>.
 * @author Sean A. Irvine
 */
public class A030742 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030742() {
    super(new A030737(), 1);
  }
}
