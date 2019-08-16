package irvine.oeis.a025;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a002.A002426;

/**
 * A025178 First differences of the central trinomial coefficients <code>A002426</code>.
 * @author Sean A. Irvine
 */
public class A025178 extends DifferenceSequence {

  /** Construct the sequence. */
  public A025178() {
    super(new A002426());
  }
}
