package irvine.oeis.a033;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a002.A002858;

/**
 * A033628 Numbers that are in both the 1-additive and 0-additive sequences (A002858 and <code>A033627)</code>.
 * @author Sean A. Irvine
 */
public class A033628 extends IntersectionSequence {

  /** Construct the sequence. */
  public A033628() {
    super(new A002858(), new A033627());
  }
}
