package irvine.oeis.a053;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000328;
import irvine.oeis.a036.A036704;

/**
 * A053411 Circle numbers (version 1): a(n)= number of points (i,j), i,j integers, contained in a circle of diameter n, centered at the origin.
 * @author Sean A. Irvine
 */
public class A053411 extends AlternatingSequence {

  /** Construct the sequence. */
  public A053411() {
    super(0, new A000328(), new A036704());
  }
}

