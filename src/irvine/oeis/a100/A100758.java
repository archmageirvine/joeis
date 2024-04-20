package irvine.oeis.a100;
// manually knest/jaguar at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a061.A061113;

/**
 * A100758 Greatest prime factor of the concatenation of terms of the n-th row of the triangle formed by the Stirling number of the second kind.
 * @author Georg Fischer
 */
public class A100758 extends Sequence2 {

  private final A061113 mSeq = new A061113();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq.next());
  }
}
