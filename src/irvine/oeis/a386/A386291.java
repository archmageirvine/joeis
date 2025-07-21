package irvine.oeis.a386;

import irvine.oeis.a000.A000108;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A386291 Long leg of the unique primitive Pythagorean triple whose inradius is A000108(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A386291 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A386291() {
    super(0, new A000108(), k -> k.add(1).multiply(k).multiply2());
  }
}

