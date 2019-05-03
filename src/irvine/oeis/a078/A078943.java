package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078943 <code>a(1)=1; a(n+1)</code> is either <code>a(n)-n</code> or <code>a(n)+n</code>, where we choose the smallest one which is a positive integer that's not among the values <code>a(1)</code>, ..., <code>a(n)</code>.
 * @author Georg Fischer
 */
public class A078943 extends FiniteSequence {

  /** Construct the sequence. */
  public A078943() {
    super(1, 2, 4, 7, 3, 8, 14, 21, 13, 22, 12, 23, 11, 24, 10, 25, 9, 26, 44, 63, 43, 64, 42, 19);
  }
}
