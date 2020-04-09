package irvine.oeis.a030;

import irvine.oeis.RecordSequence;

/**
 * A030781 n-th term <code>s(k)</code> such that <code>s(k)&gt;s(j)</code> for <code>j=1,2,...,k-1</code>, where <code>s=A030777</code> (with <code>s(0)=0)</code>.
 * @author Sean A. Irvine
 */
public class A030781 extends RecordSequence {

  /** Construct the sequence. */
  public A030781() {
    super(new A030777());
  }
}
