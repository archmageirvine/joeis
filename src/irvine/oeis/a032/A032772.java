package irvine.oeis.a032;

import irvine.oeis.FiniteSequence;

/**
 * A032772 n(n+1)(n+2)...(n+5) / (n+(n+1)+(n+2)+...+(n+5)) is an integer.
 * @author Georg Fischer
 */
public class A032772 extends FiniteSequence {

  /** Construct the sequence. */
  public A032772() {
    super(0, 5, 10, 35);
  }
}
