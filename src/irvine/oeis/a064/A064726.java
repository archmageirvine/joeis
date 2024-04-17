package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000009;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064726 Sum of primes dividing the partitions of n into distinct parts (with repetition).
 * @author Sean A. Irvine
 */
public class A064726 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064726() {
    super(0, new A000009(), k -> Functions.SOPFR.z(k));
  }
}
