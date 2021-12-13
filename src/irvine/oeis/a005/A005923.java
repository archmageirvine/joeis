package irvine.oeis.a005;

import irvine.oeis.transform.BinomialTransformSequence;
import irvine.oeis.a000.A000557;

/**
 * A005923 From solution to a difference equation.
 * @author Sean A. Irvine
 */
public class A005923 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A005923() {
    super(new A000557(), 0);
  }
}

