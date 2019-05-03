package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a003.A003136;

/**
 * A014146 Partial sums of <code>A003136</code>.
 * @author Sean A. Irvine
 */
public class A014146 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014146() {
    super(new A003136());
  }
}
