package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030772 Numbers n such that <code>s(n)=s(j)</code> for <code>j=1,2,...,n-1</code>, where <code>s=A030767</code> (with <code>s(0)=0)</code>.
 * @author Sean A. Irvine
 */
public class A030772 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030772() {
    super(new A030767(), 1);
  }
}
