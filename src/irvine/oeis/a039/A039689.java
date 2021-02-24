package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A039689 Numbers n such that phi(n) + 1 is not a prime.
 * @author Sean A. Irvine
 */
public class A039689 extends ComplementSequence {

  /** Construct the sequence. */
  public A039689() {
    super(new A039698(), Z.ONE);
  }
}
