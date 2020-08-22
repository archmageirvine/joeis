package irvine.oeis.a027;

import irvine.oeis.PartialSumSequence;

/**
 * A027130 a(n) = Sum_{0&lt;=j&lt;=i&lt;=n} A027113(i, n+j).
 * @author Sean A. Irvine
 */
public class A027130 extends PartialSumSequence {

  /** Construct the sequence. */
  public A027130() {
    super(new A027129());
  }
}
