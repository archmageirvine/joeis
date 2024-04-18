package irvine.oeis.a293;
// manually sumdiv3/sumdiv at 2023-04-11 13:56

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A293820 Number of integer-sided polygons having perimeter n, modulo rotations but not reflections.
 * @author Georg Fischer
 */
public class A293820 extends AbstractSequence {

  private int mN = 2;

  /** Construct the sequence. */
  public A293820() {
    super(3);
  }

  @Override
  public Z next() {
    ++mN;
    // a(n) = (Sum_{d|n} phi(n/d)*2^d)/n - 1 - 2^floor(n/2).
    return Integers.SINGLETON.sumdiv(mN, d -> Functions.PHI.z(mN / d).multiply(Z.ONE.shiftLeft(d)))
      .divide(mN).subtract(1).subtract(Z.ONE.shiftLeft(mN >> 1));
  }
}
