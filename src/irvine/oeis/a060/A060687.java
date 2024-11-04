package irvine.oeis.a060;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a046.A046660;

/**
 * A060687 Numbers k such that there exist exactly 2 Abelian groups of order k, i.e., A000688(k) = 2.
 * @author Sean A. Irvine
 */
public class A060687 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A060687() {
    super(1, new A046660(), 1);
  }
}
