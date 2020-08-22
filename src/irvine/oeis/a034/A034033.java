package irvine.oeis.a034;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a057.A057127;

/**
 * A034033 Both primitively and imprimitively represented by x^2+2y^2.
 * @author Sean A. Irvine
 */
public class A034033 extends IntersectionSequence {

  /** Construct the sequence. */
  public A034033() {
    super(new A057127(), new A034030());
  }
}
