package irvine.oeis.a008;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000290;

/**
 * A008794 Squares repeated; a(n) = floor(n/2)^2.
 * @author Sean A. Irvine
 */
public class A008794 extends AlternatingSequence {

  /** Construct the sequence. */
  public A008794() {
    super(new A000290(), new A000290());
  }
}


