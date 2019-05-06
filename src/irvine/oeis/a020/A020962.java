package irvine.oeis.a020;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a080.A080039;

/**
 * A020962 Sum of <code>Floor[ (1+sqrt(2))^(n-k) ]</code> for k from 1 to infinity.
 * @author Sean A. Irvine
 */
public class A020962 extends PartialSumSequence {

  /** Construct the sequence. */
  public A020962() {
    super(new A080039());
  }
}
