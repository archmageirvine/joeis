package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a008.A008454;

/**
 * A022526 Nexus numbers <code>(n+1)^10-n^10</code>.
 * @author Sean A. Irvine
 */
public class A022526 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022526() {
    super(new A008454());
  }
}
