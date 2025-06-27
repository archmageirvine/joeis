package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;

/**
 * A078331.
 * @author Sean A. Irvine
 */
public class A078340 extends Sequence2 {

  private final DirectSequence mA078142 = new A078142();
  private int mN = 1;

  @Override
  public Z next() {
    final Z t = mA078142.a(++mN);
    int k = 0;
    while (true) {
      if (mA078142.a(mN + ++k).equals(t)) {
        return Z.valueOf(k);
      }
    }
  }
}

