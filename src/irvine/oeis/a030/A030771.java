package irvine.oeis.a030;

import irvine.oeis.RecordSequence;

/**
 * A030771 n-th term <code>s(k)</code> such that <code>s(k)=s(j)</code> for <code>j=1,2,...,k-1</code>, where <code>s=A030767</code> (with <code>s(0)=0)</code>.
 * @author Sean A. Irvine
 */
public class A030771 extends RecordSequence {

  /** Construct the sequence. */
  public A030771() {
    super(new A030767());
  }
}
