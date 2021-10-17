package irvine.oeis.a038;

import irvine.oeis.a052.A052027;

/**
 * A038537 Primes base 10 that remain primes in eight bases b, 2&lt;=b&lt;=10, when the expansions are interpreted as decimal numbers.
 * @author Sean A. Irvine
 */
public class A038537 extends A052027 {

  @Override
  protected int target() {
    return 8;
  }
}
