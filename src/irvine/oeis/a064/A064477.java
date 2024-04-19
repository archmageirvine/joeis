package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064477 A064637 converted to factorial base.
 * @author Sean A. Irvine
 */
public class A064477 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064477() {
    super(0, new A064637(), n -> Functions.FACTORIAL_BASE.z(n));
  }
}

