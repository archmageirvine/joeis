package irvine.oeis.a060;

import irvine.oeis.FilterPositionSequence;

/**
 * A060650 Numbers n such that there exist exactly one non-Abelian group of order n, i.e., such that A060689(n) = 1.
 * @author Sean A. Irvine
 */
public class A060650 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A060650() {
    super(1, new A060689(), 1);
  }
}
