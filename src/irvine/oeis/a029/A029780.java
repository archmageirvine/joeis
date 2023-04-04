package irvine.oeis.a029;

import irvine.oeis.IntersectionSequence;

/**
 * A029780 Numbers k such that every digit that appears in k also appears at least once in both k^2 and k^3.
 * @author Sean A. Irvine
 */
public class A029780 extends IntersectionSequence {

  /** Construct the sequence. */
  public A029780() {
    super(new A029772(), new A029776());
  }
}
