package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a025.A025487;

/**
 * A050357 Number of ordered factorizations with 2 levels of parentheses indexed by prime signatures.
 * @author Sean A. Irvine
 */
public class A050357 extends NestedSequence {

  /** Construct the sequence. */
  public A050357() {
    // Workaround for strange behaviour in A050357
    super(1, new SkipSequence(new A050356(), 0), new A025487(), 1, 1);
  }
}
