package irvine.oeis.a075;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a071.A071251;

/**
 * A075803 Differences between adjacent palindromic squarefree numbers.
 * @author Sean A. Irvine
 */
public class A075803 extends DifferenceSequence {

  /** Construct the sequence. */
  public A075803() {
    super(1, new A071251());
  }
}
