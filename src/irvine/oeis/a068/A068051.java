package irvine.oeis.a068;

import irvine.oeis.a000.A000081;
import irvine.oeis.transform.DikTransformSequence;

/**
 * A068051 Number of n-node connected graphs with one cycle, possibly of length 1 or 2.
 * @author Sean A. Irvine
 */
public class A068051 extends DikTransformSequence {

  /** Construct the sequence. */
  public A068051() {
    super(new A000081(), 1);
    next();
  }
}

