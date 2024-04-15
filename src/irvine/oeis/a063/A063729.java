package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063729 Numbers k such that sigma(k)+1 is a square and sets a new record for such squares.
 * @author Sean A. Irvine
 */
public class A063729 extends Sequence1 {

  private long mN = 1;
  private Z mRecord = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = Functions.SIGMA.z(++mN).add(1);
      if (t.compareTo(mRecord) > 0 && t.isSquare()) {
        mRecord = t;
        return Z.valueOf(mN);
      }
    }
  }
}
