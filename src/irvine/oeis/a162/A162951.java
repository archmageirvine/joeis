package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162951 a(1)=0. a(n) is the smallest integer &gt; a(n-1) such that both a(n) and a(n)-a(n-1) have the same number of 1's when written in binary as n has when it is written in binary.
 * @author Georg Fischer
 */
public class A162951 extends FiniteSequence {

  /** Construct the sequence. */
  public A162951() {
    super(0, 1, 6, 8, 17, 20, 41);
  }
}
