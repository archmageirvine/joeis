package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a065.A065560;

/**
 * A390575 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A390575 extends Sequence1 {

  private final Sequence mS = new A065560();
  private Z mA = mS.next();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mS.next();
      if (t.compareTo(mA) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
