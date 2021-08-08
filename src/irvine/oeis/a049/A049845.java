package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049845 a(n)=Sum{T(m,k): k=1,2,...,m-1; m=2,3,...,n}, array T as in A049843.
 * @author Sean A. Irvine
 */
public class A049845 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049845() {
    super(new A049844());
  }
}
