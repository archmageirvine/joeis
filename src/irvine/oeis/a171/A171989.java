package irvine.oeis.a171;
// manually knest/eulphi at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006862;

/**
 * A171989 a(n) = A000010(A006862(n)).
 * @author Georg Fischer
 */
public class A171989 extends Sequence0 {

  private final A006862 mSeq = new A006862();

  @Override
  public Z next() {
    return Functions.PHI.z(mSeq.next());
  }
}
