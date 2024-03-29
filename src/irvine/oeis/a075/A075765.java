package irvine.oeis.a075;
// Generated by gen_seq4.pl primen/primenp at 2022-04-02 17:52

import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A075765 a(n) = floor(prime(n)/n) + (prime(n) mod n).
 * @author Georg Fischer
 */
public class A075765 extends A060822 {

  /** Construct the sequence. */
  public A075765() {
    super(1, (n, p) -> Z.valueOf(p).divide(Z.valueOf(n)).add(Z.valueOf(p).mod(Z.valueOf(n))));
  }
}
