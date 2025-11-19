package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A387122 Greatest prime divisor of 2*prime(n) + 3.
 * @author Sean A. Irvine
 */
public class A387122 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A387122() {
    super(1, new A000040(), p -> Functions.GPF.z(p.multiply2().add(3)));
  }
}
