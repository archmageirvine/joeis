package irvine.oeis.a034;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003136;

/**
 * A034020 Not of the form x^2 + x*y + y^2.
 * @author Sean A. Irvine
 */
public class A034020 extends ComplementSequence {

  /** Construct the sequence. */
  public A034020() {
    super(new A003136());
  }
}

