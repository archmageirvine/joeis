package irvine.oeis.a164;
// manually interleave at 2021-11-02 15:18

import irvine.oeis.AlternatingSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002445;
import irvine.oeis.a005.A005843;

/**
 * A164020 Denominators of Bernoulli numbers interleaved with even numbers.
 * @author Georg Fischer
 */
public class A164020 extends AlternatingSequence {

  /** Construct the sequence. */
  public A164020() {
    super(new A002445(), new SkipSequence(new A005843(), 1));
  }
}
