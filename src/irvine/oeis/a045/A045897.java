package irvine.oeis.a045;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a034.A034017;
import irvine.oeis.a034.A034019;

/**
 * A045897 Has both a primitive and imprimitive representation as x^2 + xy + y^2.
 * @author Sean A. Irvine
 */
public class A045897 extends IntersectionSequence {

  /** Construct the sequence. */
  public A045897() {
    super(new A034017(), new A034019());
  }
}
