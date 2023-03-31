package irvine.oeis.a304;

import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014708;
import irvine.oeis.transform.RootSequence;

/**
 * A304020 Coefficients of (q*(j(q)-744))^(1/4) where j(q) is the elliptic modular invariant.
 * @author Georg Fischer
 */
public class A304020 extends RootSequence {

  /** Construct the sequence. */
  public A304020() {
    super(0, new SkipSequence(new A014708(), 1), 1, 4);
  }
}
