package irvine.oeis.a069;
// Generated by gen_seq4.pl primen/primenp at 2022-04-02 17:52

import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A069459 a(n) = prime(n)^n - 1.
 * @author Georg Fischer
 */
public class A069459 extends A060822 {

  /** Construct the sequence. */
  public A069459() {
    super(1, (n, p) -> Z.valueOf(p).pow(Z.valueOf(n)).subtract(Z.ONE));
  }
}
