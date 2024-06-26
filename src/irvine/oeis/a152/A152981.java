package irvine.oeis.a152;
// Generated by gen_seq4.pl sigman1/sigma1 at 2023-02-28 23:52

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001006;

/**
 * A152981 Sum of divisors of Motzkin number A001006(n).
 * @author Georg Fischer
 */
public class A152981 extends A001006 {

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
