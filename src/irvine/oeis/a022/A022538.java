package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010810;

/**
 * A022538 Nexus numbers <code>(n+1)^22 - n^22</code>.
 * @author Sean A. Irvine
 */
public class A022538 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022538() {
    super(new A010810());
  }
}
