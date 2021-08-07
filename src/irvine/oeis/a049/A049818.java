package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049818 a(n)=Sum{T(m,k): k=1,2,...,n, m=1,2,...,n}, array T as in A049816.
 * @author Sean A. Irvine
 */
public class A049818 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049818() {
    super(new A049817());
  }
}
