package irvine.oeis.a071;

import irvine.oeis.a002.A002487;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A071017 Moebius transform of A002487.
 * @author Sean A. Irvine
 */
public class A071017 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A071017() {
    super(0, new A002487(), 2);
    next();
  }
}
