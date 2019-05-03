package irvine.oeis.a060;

import irvine.oeis.FiniteSequence;

/**
 * A060815 Powers of 2 with each digit a power of <code>2</code> (only digits 0,1,2,4,8 are used).
 * @author Georg Fischer
 */
public class A060815 extends FiniteSequence {

  /** Construct the sequence. */
  public A060815() {
    super(2, 4, 8, 128, 1024, 2048);
  }
}
