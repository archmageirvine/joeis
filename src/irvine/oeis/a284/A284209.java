package irvine.oeis.a284;

import irvine.math.z.Z;
import irvine.oeis.a059.A059318;

/**
 * A284209 Decimal representation of generation n in the reversible cellular automaton RCA(3) when started with a single ON cell at generation 0.
 * @author Georg Fischer
 */
public class A284209 extends A059318 {

  protected Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.shiftLeft(1).add(super.next());
      if (mCol == mRow) {
        final Z result = mSum;
        mSum = Z.ZERO;
        return result;
      }
    }
  }
}
