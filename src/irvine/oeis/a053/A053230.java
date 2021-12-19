package irvine.oeis.a053;

import irvine.oeis.DifferenceSequence;

/**
 * A053230 First differences between numbers k for which sigma(k) &lt; sigma(k+1).
 * @author Sean A. Irvine
 */
public class A053230 extends DifferenceSequence {

  /** Construct the sequence. */
  public A053230() {
    super(new A053224());
  }
}
