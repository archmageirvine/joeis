package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000093;

/**
 * A035936 Number of squares in (n^3, (n+1)^3 ].
 * @author Sean A. Irvine
 */
public class A035936 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035936() {
    super(new A000093());
  }
}

