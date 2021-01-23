package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a008.A008455;

/**
 * A022527 Nexus numbers: a(n) = (n+1)^11 - n^11.
 * @author Sean A. Irvine
 */
public class A022527 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022527() {
    super(new A008455());
  }
}
