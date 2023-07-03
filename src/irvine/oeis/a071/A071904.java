package irvine.oeis.a071;

import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014076;

/**
 * A071904 Odd composite numbers.
 * @author Sean A. Irvine
 */
public class A071904 extends SkipSequence {

  /** Construct the sequence. */
  public A071904() {
    super(1, new A014076(), 1);
  }
}
