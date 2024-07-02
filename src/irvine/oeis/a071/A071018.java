package irvine.oeis.a071;

import irvine.oeis.a002.A002487;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A071018 Inverse Moebius transform of A002487.
 * @author Sean A. Irvine
 */
public class A071018 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A071018() {
    super(0, new A002487(), 2);
    next();
  }
}
