package irvine.oeis.a053;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000328;
import irvine.oeis.a036.A036704;

/**
 * A053411.
 * @author Sean A. Irvine
 */
public class A053411 extends AlternatingSequence {

  /** Construct the sequence. */
  public A053411() {
    super(new A000328(), new A036704());
  }
}

