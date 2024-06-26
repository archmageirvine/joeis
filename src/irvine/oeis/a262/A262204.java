package irvine.oeis.a262;
// Generated by gen_seq4.pl primen/primenp at 2022-04-05 21:14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A262204 a(n) = (2*prime(n))! / prime(n)!.
 * @author Georg Fischer
 */
public class A262204 extends A060822 {

  /** Construct the sequence. */
  public A262204() {
    super(1, (n, p) -> Functions.FACTORIAL.z(Z.TWO.multiply(Z.valueOf(p))).divide(Functions.FACTORIAL.z(Z.valueOf(p))));
  }
}
