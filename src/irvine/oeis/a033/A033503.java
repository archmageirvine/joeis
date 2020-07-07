package irvine.oeis.a033;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a046.A046025;

/**
 * A033503 First differences of <code>A046025</code>.
 * @author Sean A. Irvine
 */
public class A033503 extends DifferenceSequence {

  /** Construct the sequence. */
  public A033503() {
    super(new A046025());
  }
}
