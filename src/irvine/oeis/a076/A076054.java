package irvine.oeis.a076;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a006.A006513;

/**
 * A076054 a(n) = Sum_{k=1..n} A006513(k).
 * @author Sean A. Irvine
 */
public class A076054 extends PartialSumSequence {

  /** Construct the sequence. */
  public A076054() {
    super(1, new A006513());
  }
}
