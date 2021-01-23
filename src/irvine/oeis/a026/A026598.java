package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026598 Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=n, T given by A026584.
 * @author Sean A. Irvine
 */
public class A026598 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026598() {
    super(new A026596());
  }
}
