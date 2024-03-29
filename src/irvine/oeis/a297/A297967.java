package irvine.oeis.a297;
// Generated by gen_seq4.pl primen/primenp at 2022-04-02 17:52

import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A297967 a(n) = 5^n mod prime(n).
 * @author Georg Fischer
 */
public class A297967 extends A060822 {

  /** Construct the sequence. */
  public A297967() {
    super(1, (n, p) -> Z.FIVE.pow(Z.valueOf(n)).mod(Z.valueOf(p)));
  }
}
