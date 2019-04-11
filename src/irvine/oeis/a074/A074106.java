package irvine.oeis.a074;

import irvine.oeis.FiniteSequence;

/**
 * A074106 <code>a(1)=1</code>; <code>a(n)</code> is the minimal unused odd prime such that the sum <code>a(1)+a(2)+...+a(n)</code> is divisible by n.
 * @author Georg Fischer
 */
public class A074106 extends FiniteSequence {

  /** Construct the sequence. */
  public A074106() {
    super(1, 3, 5, 7, 19, 13, 29, 11, 47);
  }
}
