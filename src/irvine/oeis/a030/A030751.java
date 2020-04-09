package irvine.oeis.a030;

import irvine.oeis.RecordSequence;

/**
 * A030751 n-th term <code>s(k)</code> such that <code>s(k)&gt;s(j)</code> for <code>j=1,2,...,k-1</code>, where <code>s=A030747</code> (with <code>s(0)=0)</code>.
 * @author Sean A. Irvine
 */
public class A030751 extends RecordSequence {

  /** Construct the sequence. */
  public A030751() {
    super(new A030747());
  }
}
