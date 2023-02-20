package irvine.oeis.a355;
// manually rootet at 2023-02-20 10:45

import irvine.oeis.SkipSequence;
import irvine.oeis.a005.A005189;
import irvine.oeis.transform.RootSequence;

/**
 * A355957 Different Fiedler pencils with repetitions of degree n.
 * (omitting the first 2 terms).
 * @author Georg Fischer
 */
public class A355957 extends RootSequence {

  /** Construct the sequence. */
  public A355957() {
    super(1, new SkipSequence(new A005189(), 3), 2, 1);
  }
}
