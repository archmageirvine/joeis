package irvine.oeis.a036;

import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;

/**
 * A036992 Numbers not in A036990 nor A036991.
 * @author Sean A. Irvine
 */
public class A036992 extends ComplementSequence {

  /** Construct the sequence. */
  public A036992() {
    super(new UnionSequence(new A036990(), new A036991()));
  }
}
