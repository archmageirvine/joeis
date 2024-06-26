package irvine.oeis.a078;
// Generated by gen_seq4.pl knest/eulphi at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014574;

/**
 * A078578 Euler's totient of the average of n-th twin prime pair.
 * @author Georg Fischer
 */
public class A078578 extends A014574 {
  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}
