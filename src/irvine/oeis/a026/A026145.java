package irvine.oeis.a026;

import irvine.oeis.RecordSequence;

/**
 * A026145 a(n) = s(k), where k is the n-th number such that s(j) &lt; s(k) for all j &lt; k, where s = A026142. Also a(n) = 2*t(n) for n &gt;= 2, where t = A026144.
 * @author Sean A. Irvine
 */
public class A026145 extends RecordSequence {

  /** Construct the sequence. */
  public A026145() {
    super(new A026142());
  }
}
