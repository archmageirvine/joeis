package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A025044 a(n) not of form prime - a(k), k &lt; n.
 * @author Sean A. Irvine
 */
public class A025044 extends MemorySequence {

  {
    setOffset(1);
  }

  private Z mN = Z.NEG_ONE;

  @Override
  protected Z computeNext() {
    while (true) {
      mN = mN.add(1);
      boolean ok = true;
      for (final Z t : this) {
        if (mN.add(t).isProbablePrime()) {
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

