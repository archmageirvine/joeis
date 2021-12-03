package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053009 Primes associated with A053008.
 * @author Sean A. Irvine
 */
public class A053009 extends A053008 {

  @Override
  protected Z select(final Z t, final Z p, final Z prod) {
    return p;
  }
}
