package irvine.oeis.a006;

import irvine.oeis.a000.A000122;
import irvine.oeis.transform.RevertTransformSequence;

/**
 * A006195 Reversion of Jacobi theta_3.
 * @author Sean A. Irvine
 */
public class A006195 extends RevertTransformSequence {

  /** Construct the sequence. */
  public A006195() {
    super(0, new A000122());
  }
}

