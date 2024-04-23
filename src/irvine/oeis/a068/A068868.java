package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;

/**
 * A068868 Numbers prime(k) such that A068863(k) = prime(k).
 * @author Sean A. Irvine
 */
public class A068868 extends FilterSequence {

  /** Construct the sequence. */
  public A068868() {
    super(1, new A068863(), (k, v) -> v.equals(Functions.PRIME.z(k)));
  }
}
