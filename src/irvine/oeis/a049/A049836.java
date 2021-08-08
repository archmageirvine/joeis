package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049836 a(n)=Sum{T(m,k): k=1,2,...,m; m=1,2,...,n}, array T as in A049834.
 * @author Sean A. Irvine
 */
public class A049836 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049836() {
    super(new A049835());
  }
}
