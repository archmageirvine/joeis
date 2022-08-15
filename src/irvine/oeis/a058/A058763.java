package irvine.oeis.a058;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a005.A005277;
import irvine.oeis.a005.A005278;

/**
 * A058763 Integers which are neither totient nor cototient.
 * @author Sean A. Irvine
 */
public class A058763 extends IntersectionSequence {

  /** Construct the sequence. */
  public A058763() {
    super(new A005277(), new A005278());
  }
}
