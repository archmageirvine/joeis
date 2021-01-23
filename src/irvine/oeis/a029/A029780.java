package irvine.oeis.a029;

import irvine.oeis.IntersectionSequence;

/**
 * A029780 Every digit that appears in n also appears at least once in both n^2 and n^3.
 * @author Sean A. Irvine
 */
public class A029780 extends IntersectionSequence {

  /** Construct the sequence. */
  public A029780() {
    super(new A029772(), new A029776());
  }
}
