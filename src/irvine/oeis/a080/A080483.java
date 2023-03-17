package irvine.oeis.a080;
// manually 2023-03-14

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080483 Reverse concatenation of next n numbers with a(1) = 0.
 * @author Georg Fischer
 */
public class A080483 extends Sequence1 {

  private int mN = 0;
  private long mA = -1;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    ++mN;
    mS.setLength(0);
    for (int i = 1; i <= mN; ++i) {
      mS.insert(0, ++mA);
    }
    return new Z(mS.toString());
  }
}
