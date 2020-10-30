package irvine.oeis.a036;

import irvine.oeis.PartialSumSequence;

/**
 * A036388 Number of odd split numbers (A036382) of which the binary order (A029837) is &lt;= n, i.e., those which occur below 2^n.
 * @author Sean A. Irvine
 */
public class A036388 extends PartialSumSequence {

  /** Construct the sequence. */
  public A036388() {
    super(new A036384());
  }
}
