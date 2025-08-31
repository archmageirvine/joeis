package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.a078.A078515;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A079889 Primes indexed by A078515; i.e., primes which start record runs of consecutive primes with distinct first differences.
 * @author Sean A. Irvine
 */
public class A079889 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A079889() {
    super(new A078515(), Functions.PRIME::z);
  }
}
