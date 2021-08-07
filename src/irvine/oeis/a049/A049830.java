package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049830 a(n)=Sum{T(m,k): k=1,2,...,n, m=1,2,...,n}; array T as in A049828.
 * @author Sean A. Irvine
 */
public class A049830 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049830() {
    super(new A049829());
  }
}
