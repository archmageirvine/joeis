package irvine.oeis.a377;

import irvine.oeis.a002.A002315;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A377725 Length of the short leg of the unique primitive Pythagorean triple whose inradius is A002315(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A377725 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A377725() {
    super(0, new A002315(), k -> k.multiply2().add(1));
  }
}
