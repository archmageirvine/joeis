package irvine.oeis.a382;

import irvine.oeis.a000.A000045;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A382608 Long leg of the unique primitive Pythagorean triple whose inradius is A000045(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A382608 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A382608() {
    super(1, new A000045().skip(1), k -> k.add(1).multiply(k).multiply2());
  }
}
