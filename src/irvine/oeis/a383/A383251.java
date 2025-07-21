package irvine.oeis.a383;

import irvine.oeis.a000.A000108;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A383251 Short leg of the unique primitive Pythagorean triple whose inradius is A000108(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A383251 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A383251() {
    super(0, new A000108(), k -> k.multiply2().add(1));
  }
}

