package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026701 Sum{T(i,j)}, 0&lt;=i&lt;=n, 0&lt;=j&lt;=n, T given by A026692.
 * @author Sean A. Irvine
 */
public class A026701 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026701() {
    super(new A026699());
  }
}
