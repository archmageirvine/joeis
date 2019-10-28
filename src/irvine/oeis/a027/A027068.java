package irvine.oeis.a027;

import irvine.oeis.PartialSumSequence;

/**
 * A027068 <code>a(n) = Sum_{0&lt;=j&lt;=i&lt;=n} A027052(i, n+j)</code>.
 * @author Sean A. Irvine
 */
public class A027068 extends PartialSumSequence {

  /** Construct the sequence. */
  public A027068() {
    super(new A027067());
  }
}
