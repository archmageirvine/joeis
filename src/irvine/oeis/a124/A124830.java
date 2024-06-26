package irvine.oeis.a124;
// Generated by gen_seq4.pl knest/jaguarz at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a055.A055932;

/**
 * A124830 Number of distinct prime factors of A055932(n).
 * @author Georg Fischer
 */
public class A124830 extends A055932 {
  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}
