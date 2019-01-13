package irvine.oeis.a068;

import irvine.oeis.DikTransformSequence;
import irvine.oeis.a000.A000081;

/**
 * A068051.
 * @author Sean A. Irvine
 */
public class A068051 extends DikTransformSequence {

  /** Construct the sequence. */
  public A068051() {
    super(new A000081(), 1);
    next();
  }
}

