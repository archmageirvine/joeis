package irvine.oeis.a036;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a018.A018252;

/**
 * A036691 Compositorial numbers: product of first n composite numbers.
 * @author Sean A. Irvine
 */
public class A036691 extends PartialProductSequence {

  /** Construct the sequence. */
  public A036691() {
    super(new A018252());
  }
}
