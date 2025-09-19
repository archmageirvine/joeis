package irvine.oeis.a080;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a079.A079255;

/**
 * A080428 First differences of A079255.
 * @author Sean A. Irvine
 */
public class A080428 extends DifferenceSequence {

  /** Construct the sequence. */
  public A080428() {
    super(1, new A079255());
  }
}

