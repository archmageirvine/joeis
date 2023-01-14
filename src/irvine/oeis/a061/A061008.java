package irvine.oeis.a061;

import irvine.oeis.PartialSumSequence;

/**
 * A061006 a(n) = (n-1)! mod n.
 * @author Sean A. Irvine
 */
public class A061008 extends PartialSumSequence {

  /** Construct the sequence. */
  public A061008() {
    super(new A061007());
  }
}
