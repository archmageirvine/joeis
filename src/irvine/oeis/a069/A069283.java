package irvine.oeis.a069;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001227;

/**
 * A069283 a(n) = -1 + number of odd divisors of n.
 * @author Georg Fischer
 */
public class A069283 extends Sequence0 {

  private int mN = -1;
  private final A001227 mSeq = new A001227();

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : mSeq.next().subtract(1);
  }
}
