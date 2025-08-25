package irvine.oeis.a079;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a045.A045918;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079676 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079676() {
    super(1, 0, new A045918(), PALINDROME);
  }
}

