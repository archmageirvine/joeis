package irvine.oeis.a124;
// manually knest/jaguarz at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a055.A055932;

/**
 * A124831 Number of prime factors of A055932(n) with repetition.
 * @author Georg Fischer
 */
public class A124831 extends Sequence0 {

  private final A055932 mSeq = new A055932();

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(mSeq.next());
  }
}
