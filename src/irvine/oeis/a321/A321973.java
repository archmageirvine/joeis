package irvine.oeis.a321;
// manually partsumm/partsum at 2022-03-24 22:32

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a065.A065958;

/**
 * A321973 Partial sums of the Dedekind psi_2(k) function, for 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A321973 extends PrependSequence {

  /** Construct the sequence. */
  public A321973() {
    super(new PartialSumSequence(new A065958()), 0);
  }
}
