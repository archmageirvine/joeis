package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010812;

/**
 * A022540 Nexus numbers <code>(n+1)^24 - n^24</code>.
 * @author Sean A. Irvine
 */
public class A022540 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022540() {
    super(new A010812());
  }
}
