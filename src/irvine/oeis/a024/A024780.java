package irvine.oeis.a024;

import irvine.oeis.FiniteSequence;

/**
 * A024780 Every suffix prime and no 0 digits in base <code>5</code> (written in base <code>5)</code>.
 * @author Georg Fischer
 */
public class A024780 extends FiniteSequence {

  /** Construct the sequence. */
  public A024780() {
    super(2, 3, 12, 23, 32, 43, 232, 243, 412, 423, 2232, 4412, 4423, 22232, 222232);
  }
}
