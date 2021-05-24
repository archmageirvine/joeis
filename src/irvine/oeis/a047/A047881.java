package irvine.oeis.a047;

import irvine.oeis.PartialSumSequence;

/**
 * A047881 a(n)=Sum{T(h,k): h=0,1,...,n; k=0,1,...,n}, array T counting knights' moves as in A049604.
 * @author Sean A. Irvine
 */
public class A047881 extends PartialSumSequence {

  /** Construct the sequence. */
  public A047881() {
    super(new A047879());
  }
}
