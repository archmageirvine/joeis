package irvine.oeis.a026;

import irvine.oeis.RecordPositionSequence;

/**
 * A026168 a(n) = n-th number k such that s(j)&lt;s(k) for all j&lt;k. Also a(n) = (n-1)st number k such that s(k)&gt;k, for n &gt;= 3, where s = A026166.
 * @author Sean A. Irvine
 */
public class A026168 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A026168() {
    super(new A026166(), 1);
  }
}
