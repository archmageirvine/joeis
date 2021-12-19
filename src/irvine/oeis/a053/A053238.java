package irvine.oeis.a053;

import irvine.oeis.DifferenceSequence;

/**
 * A053238 First differences between numbers k for which sigma(k) &gt; sigma(k+1).
 * @author Sean A. Irvine
 */
public class A053238 extends DifferenceSequence {

  /** Construct the sequence. */
  public A053238() {
    super(new A053226());
  }
}
