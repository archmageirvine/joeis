package irvine.oeis.a330;
// manually primen/primenp at 2022-04-05 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A330526 a(n) = (p-1)! mod p^3, where p = prime(n).
 * @author Georg Fischer
 */
public class A330526 extends A060822 {

  /** Construct the sequence. */
  public A330526() {
    super(1, (n, p) -> {
      return Functions.FACTORIAL.z(p - 1).mod(Z.valueOf(p).pow(3));
    });
  }
}
