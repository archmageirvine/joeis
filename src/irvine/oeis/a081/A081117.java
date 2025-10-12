package irvine.oeis.a081;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a038.A038129;

/**
 * A081117 Differences of Beatty sequence for cube root of 2.
 * @author Sean A. Irvine
 */
public class A081117 extends DifferenceSequence {

  /** Construct the sequence. */
  public A081117() {
    super(1, new A038129());
  }
}
