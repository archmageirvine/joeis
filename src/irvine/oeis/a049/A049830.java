package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049830 a(n) = Sum_{k=1..n, m=1..k} T(m,k); array T as in A049828.
 * @author Sean A. Irvine
 */
public class A049830 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049830() {
    super(1, new A049829());
  }
}
