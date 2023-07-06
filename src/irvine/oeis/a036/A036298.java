package irvine.oeis.a036;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000197;

/**
 * A036298 (n!)!, n&gt;0 (note that A000197 is the correct version of this sequence, with a(0) = 1, not 0).
 * @author Sean A. Irvine
 */
public class A036298 extends PrependSequence {

  /** Construct the sequence. */
  public A036298() {
    super(new A000197().skip(1), 0);
  }
}

