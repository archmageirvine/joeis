package irvine.oeis.a134;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A134323 a(n) = Legendre(-3, prime(n)).
 * @author Georg Fischer
 */
public class A134323 extends Sequence1 {

  private final Sequence mSeq = new A000040().skip();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return (mN <= 1) ? Z.valueOf(mN - 2) : Z.valueOf(Functions.JACOBI.i(-3, mSeq.next()));
  }
}
