package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025043 a(n) is not of the form prime + a(k), k &lt; n.
 * @author Sean A. Irvine
 */
public class A025043 extends MemorySequence {

  private Z mN = Z.NEG_ONE;

  @Override
  protected Z computeNext() {
    while (true) {
      mN = mN.add(1);
      boolean ok = true;
      for (final Z t : this) {
        if (mN.subtract(t).isProbablePrime()) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return mN;
      }
    }
  }
}

