package irvine.oeis.a072;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a018.A018930;

/**
 * A072470 a(0) = 0, a(1) = 9; for n &gt; 1 a(n) = smallest positive square (possibly required to be greater than a(n-1)?) such that a(0) + a(1) + ... + a(n) is a square.
 * @author Georg Fischer
 */
public class A072470 extends Sequence0 {

  private int mN = -1;
  private final A018930 mSeq = new A018930();

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : mSeq.next().square();
  }
}
