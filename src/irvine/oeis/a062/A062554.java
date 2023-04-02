package irvine.oeis.a062;

import irvine.oeis.FiniteSequence;
import irvine.oeis.MultiplicativeClosureSequence;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062554 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A062554() {
    super(new FiniteSequence(4, 6, 8, 12, 20));
    next();
  }
}

