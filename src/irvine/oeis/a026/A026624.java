package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026624 a(n) = Sum{T(i,j)}, 0&lt;=i&lt;=n, 0&lt;=j&lt;=n, T given by A026615.
 * @author Sean A. Irvine
 */
public class A026624 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026624() {
    super(new A026622());
  }
}
