package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026690 a(n) = Sum{T(i,j)}, 0&lt;=i&lt;=n, 0&lt;=j&lt;=n, T given by A026681.
 * @author Sean A. Irvine
 */
public class A026690 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026690() {
    super(new A026688());
  }
}
