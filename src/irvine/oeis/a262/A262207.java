package irvine.oeis.a262;
// Generated by gen_seq4.pl primen/primenp at 2022-04-02 17:52

import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A262207 a(n) = prime(n)^n mod n^n.
 * @author Georg Fischer
 */
public class A262207 extends A060822 {

  /** Construct the sequence. */
  public A262207() {
    super(1, (n, p) -> Z.valueOf(p).pow(Z.valueOf(n)).mod(Z.valueOf(n).pow(Z.valueOf(n))));
  }
}
