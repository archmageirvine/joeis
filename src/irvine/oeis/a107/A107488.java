package irvine.oeis.a107;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a052.A052384;

/**
 * A107488 Number of letters in the words formed by the digital recitation of Pi in the English language.
 * @author Georg Fischer
 */
public class A107488 extends PrependSequence {

  /** Construct the sequence. */
  public A107488() {
    super(0, new A052384(), 5);
  }
}
