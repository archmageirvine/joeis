package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A086135 Numbers n such that n and n+10 are both prime but are non-consecutive; which means that at least one prime is between n and n+10; it is not identical with A023303 because here the terms of A031928 are missing.
 * @author Sean A. Irvine
 */
public class A086135 extends FilterSequence {

  /** Construct the sequence. */
  public A086135() {
    super(1, new A000040(), p -> p.add(10).isProbablePrime() && !Z.TEN.equals(Functions.NEXT_PRIME.z(p).subtract(p)));
  }
}

