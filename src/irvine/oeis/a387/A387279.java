package irvine.oeis.a387;

import irvine.oeis.a006.A006530;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A080756.
 * @author Sean A. Irvine
 */
public class A387279 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A387279() {
    super(1, new A006530(), 0);
    skip();
  }
}
