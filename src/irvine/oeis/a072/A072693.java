package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.oeis.HypergeometricSequence;

/**
 * A072678.
 * @author Sean A. Irvine
 */
public class A072693 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A072693() {
    super(1, 1, 1, "[[5,-5],[6],[-1]]", "", (n, v) -> v.multiply(Functions.FACTORIAL.z(5 * n - 1)).multiply(n).divide(24).num());
  }
}
