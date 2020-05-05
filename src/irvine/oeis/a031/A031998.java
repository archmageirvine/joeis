package irvine.oeis.a031;

import irvine.oeis.SkipSequence;
import irvine.oeis.a023.A023759;

/**
 * A031998 Nonincreasing base 3 digits.
 * @author Sean A. Irvine
 */
public class A031998 extends SkipSequence {

  /** Construct the sequence. */
  public A031998() {
    super(new A023759(), 1);
  }
}
