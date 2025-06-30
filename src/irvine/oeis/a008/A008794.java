package irvine.oeis.a008;

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a000.A000290;

/**
 * A008794 Squares repeated; a(n) = floor(n/2)^2.
 * @author Sean A. Irvine
 */
public class A008794 extends InterleaveSequence {

  /** Construct the sequence. */
  public A008794() {
    super(0, new A000290(), new A000290());
  }
}

