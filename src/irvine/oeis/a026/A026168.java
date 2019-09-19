package irvine.oeis.a026;

import irvine.oeis.RecordPositionSequence;

/**
 * A026168 <code>a(n) = n-th</code> number k such that <code>s(j)&lt;s(k)</code> for all j&lt;k. Also <code>a(n) = (n-1)st</code> number k such that <code>s(k)&gt;k</code>, for <code>n &gt;= 3</code>, where s <code>= A026166</code>.
 * @author Sean A. Irvine
 */
public class A026168 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A026168() {
    super(new A026166(), 1);
  }
}
