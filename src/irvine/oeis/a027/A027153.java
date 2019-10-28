package irvine.oeis.a027;

import irvine.oeis.PartialSumSequence;

/**
 * A027153 <code>a(n) = Sum_{0&lt;=j&lt;=i&lt;=n} A027144(i, j)</code>.
 * @author Sean A. Irvine
 */
public class A027153 extends PartialSumSequence {

  /** Construct the sequence. */
  public A027153() {
    super(new A027151());
  }
}
