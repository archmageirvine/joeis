package irvine.oeis.a034;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a008.A008784;

/**
 * A034025 Both primitively and imprimitively represented by x^2+y^2.
 * @author Sean A. Irvine
 */
public class A034025 extends IntersectionSequence {

  /** Construct the sequence. */
  public A034025() {
    super(0, new A034023(), new A008784());
  }
}
