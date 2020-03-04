package irvine.oeis.a029;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a002.A002113;

/**
 * A029742 Nonpalindromic numbers.
 * @author Sean A. Irvine
 */
public class A029742 extends ComplementSequence {

  /** Construct the sequence. */
  public A029742() {
    super(new A002113());
  }
}
