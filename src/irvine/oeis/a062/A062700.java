package irvine.oeis.a062;
// Generated by gen_seq4.pl sigman1/sigma1 at 2023-02-28 23:52

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a023.A023194;

/**
 * A062700 Terms of A000203 that are prime.
 * @author Georg Fischer
 */
public class A062700 extends A023194 {

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
