package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010811;

/**
 * A022539 Nexus numbers (n+1)^23 - n^23.
 * @author Sean A. Irvine
 */
public class A022539 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022539() {
    super(new A010811());
  }
}
