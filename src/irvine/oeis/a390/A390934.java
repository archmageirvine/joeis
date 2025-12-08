package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001358;

/**
 * A390934 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A390934 extends Sequence1 {

  private final DirectSequence mS = DirectSequence.create(new A001358());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 1;
    while (true) {
      ++k;
      final Z sk = mS.a(k);
      for (int j = 1; j < k; ++j) {
        if (sk.subtract(mS.a(j)).mod(mN) == 0) {
          return Z.valueOf(k);
        }
      }
    }
  }
}
