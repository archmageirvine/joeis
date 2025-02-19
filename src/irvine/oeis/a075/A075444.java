package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075444 a(n) = A075443(n) mod A000010(n) [using least nonnegative residue].
 * @author Sean A. Irvine
 */
public class A075444 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075444() {
    super(1, new A075443().skip(), (n, k) -> k.mod(Functions.PHI.z(n)));
  }
}
