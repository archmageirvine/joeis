package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053010 Products of split primes associated with A053008.
 * @author Sean A. Irvine
 */
public class A053010 extends A053008 {

  @Override
  protected Z select(final Z t, final Z p, final Z prod) {
    return prod;
  }
}
