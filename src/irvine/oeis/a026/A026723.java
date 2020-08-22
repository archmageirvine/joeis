package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026723 a(n) = Sum{T(i,j)}, 0&lt;=i&lt;=n, 0&lt;=j&lt;=i, T given by A026714.
 * @author Sean A. Irvine
 */
public class A026723 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026723() {
    super(new A026721());
  }
}
