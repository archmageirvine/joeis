package irvine.oeis.a031;

import irvine.oeis.SkipSequence;
import irvine.oeis.a023.A023760;

/**
 * A031999 Nonincreasing base 4 digits.
 * @author Sean A. Irvine
 */
public class A031999 extends SkipSequence {

  /** Construct the sequence. */
  public A031999() {
    super(new A023760(), 1);
  }
}
