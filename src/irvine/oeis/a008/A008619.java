package irvine.oeis.a008;

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a000.A000027;

/**
 * A008619 Positive integers repeated.
 * @author Sean A. Irvine
 */
public class A008619 extends InterleaveSequence {

  /** Construct the sequence. */
  public A008619() {
    super(0, new A000027(), new A000027());
  }
}
