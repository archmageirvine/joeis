package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A061862.
 * @author Sean A. Irvine
 */
public class A081053 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A081053() {
    super(1, 1, 1, (r, s) -> Functions.PRIME.z(r).square().add(Functions.PRIME.z(s)));
  }
}
