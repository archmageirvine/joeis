package irvine.oeis.a008;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000027;

/**
 * A008619 Positive integers repeated.
 * @author Sean A. Irvine
 */
public class A008619 extends AlternatingSequence {

  /** Construct the sequence. */
  public A008619() {
    super(new A000027(), new A000027());
  }
}
