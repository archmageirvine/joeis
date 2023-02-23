package irvine.oeis.a198;
// manually rootet at 2023-02-21 22:24

import irvine.oeis.SkipSequence;
import irvine.oeis.a058.A058091;
import irvine.oeis.transform.RootSequence;

/**
 * A198955 q-expansion of modular form t_{3B}.
 * @author Georg Fischer
 */
public class A198955 extends RootSequence {

  /** Construct the sequence. */
  public A198955() {
    super(-1, new SkipSequence(new A058091(), 1), 3, 1);
  }
}
