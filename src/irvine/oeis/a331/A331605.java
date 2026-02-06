package irvine.oeis.a331;

import irvine.oeis.a392.A392201;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A331605 Positive integers k such that k = (a^2 + b^2 + c^2)/(a*b + b*c + c*a) for some integers a, b and c.
 * @author Sean A. Irvine
 */
public class A331605 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A331605() {
    super(1, new A392201(), k -> k.subtract(1));
  }
}
