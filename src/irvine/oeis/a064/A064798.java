package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.oeis.a002.A002275;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064798 Sum of primes dividing the repunit numbers (with repetition).
 * @author Sean A. Irvine
 */
public class A064798 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064798() {
    super(0, new A002275(), k -> Functions.SOPFR.z(k));
  }
}

