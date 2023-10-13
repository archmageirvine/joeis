package irvine.oeis.a066;

import irvine.oeis.a000.A000041;
import irvine.oeis.transform.RevertTransformSequence;

/**
 * A066398.
 * @author Sean A. Irvine
 */
public class A066398 extends RevertTransformSequence {

  /** Construct the sequence. */
  public A066398() {
    super(0, new A000041());
  }
}

