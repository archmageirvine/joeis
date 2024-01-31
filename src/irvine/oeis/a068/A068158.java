package irvine.oeis.a068;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004086;

/**
 * A068158 a(n) = floor[ n!/(R(n))! ], where R(n) = Digit reversal of n (A004086).
 * @author Sean A. Irvine
 */
public class A068158 extends Sequence1 {

  private final Sequence mSeq = new A004086().skip();
  private int mN = 0;

  @Override
  public Z next() {
    return MemoryFactorial.SINGLETON.factorial(++mN).divide(MemoryFactorial.SINGLETON.factorial(mSeq.next()));
  }
}
