package irvine.oeis.a026;

import irvine.oeis.RecordSequence;

/**
 * A026145 <code>a(n) = s(k)</code>, where k is the n-th number such that <code>s(j) &lt; s(k)</code> for all j <code>&lt</code>; k, where s <code>= A026142</code>. Also <code>a(n) = 2*t(n)</code> for <code>n &gt;= 2</code>, where t <code>= A026144</code>.
 * @author Sean A. Irvine
 */
public class A026145 extends RecordSequence {

  /** Construct the sequence. */
  public A026145() {
    super(new A026142());
  }
}
