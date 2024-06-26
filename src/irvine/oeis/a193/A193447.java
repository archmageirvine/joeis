package irvine.oeis.a193;
// Generated by gen_seq4.pl primen/primenp at 2022-04-05 21:14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A193447 a(n) = ((p - 2)! + p - 1)/(p*(p - 1)) where p is the n-th prime.
 * @author Georg Fischer
 */
public class A193447 extends A060822 {

  /** Construct the sequence. */
  public A193447() {
    super(4, (n, p) -> Functions.FACTORIAL.z(Z.valueOf(p).subtract(Z.TWO)).add(Z.valueOf(p)).subtract(Z.ONE).divide(Z.valueOf(p).multiply(Z.valueOf(p).subtract(Z.ONE))));
  }
}
