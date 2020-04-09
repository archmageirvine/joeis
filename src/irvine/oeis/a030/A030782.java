package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030782 n-th number k such that <code>s(k)&gt;s(j)</code> for <code>j=1,2,...,k-1</code>, where <code>s=A030777</code> (with <code>s(0)=0)</code>.
 * @author Sean A. Irvine
 */
public class A030782 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030782() {
    super(new A030777(), 1);
  }
}
