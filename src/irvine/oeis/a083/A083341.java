package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A083341 Smaller factor of the n-th semiprime of the form (m!)^2 + 1.
 * @author Sean A. Irvine
 */
public class A083341 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A083341() {
    super(1, new A083340(), k -> Functions.LPF.z(Functions.FACTORIAL.z(k).square().add(1)));
  }
}
