package irvine.oeis.a214;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a140.A140472;

/**
 * A214546 First differences of A140472.
 * @author Sean A. Irvine
 */
public class A214546 extends DifferenceSequence {

  /** Construct the sequence. */
  public A214546() {
    super(new A140472());
  }
}
