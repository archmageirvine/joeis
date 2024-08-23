package irvine.oeis.a071;

import irvine.oeis.InverseSequence;
import irvine.oeis.a069.A069624;

/**
 * A071913 Smallest k such that A069624(k) = n.
 * @author Sean A. Irvine
 */
public class A071913 extends InverseSequence {

  /** Construct the sequence. */
  public A071913() {
    super(1, new A069624());
  }
}
