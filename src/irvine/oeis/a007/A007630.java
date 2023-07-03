package irvine.oeis.a007;

import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002562;

/**
 * A007630 A queens problem.
 * @author Sean A. Irvine
 */
public class A007630 extends SkipSequence {

  /** Construct the sequence. */
  public A007630() {
    super(4, new A002562(), 8);
  }
}
