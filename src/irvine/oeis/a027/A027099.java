package irvine.oeis.a027;

import irvine.oeis.PartialSumSequence;

/**
 * A027099 <code>a(n) = Sum_{0&lt;=i&lt;=i&lt;=n} A027082(i, n+j)</code>.
 * @author Sean A. Irvine
 */
public class A027099 extends PartialSumSequence {

  /** Construct the sequence. */
  public A027099() {
    super(new A027098());
  }
}
