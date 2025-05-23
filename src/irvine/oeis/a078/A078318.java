package irvine.oeis.a078;
// Generated by gen_seq4.pl sigman1/sigma1 at 2023-02-28 23:52

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A078318 Sum of divisors of n*rad(n)+1, where rad = A007947 (squarefree kernel).
 * @author Georg Fischer
 */
public class A078318 extends A078310 {

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
