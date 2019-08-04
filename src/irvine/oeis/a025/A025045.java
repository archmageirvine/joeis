package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025045 <code>a(n)</code> not of form prime <code>+- a(k), k &lt; n</code>.
 * @author Sean A. Irvine
 */
public class A025045 extends MemorySequence {

  private Z mN = Z.NEG_ONE;

  @Override
  protected Z computeNext() {
    while (true) {
      mN = mN.add(1);
      boolean ok = true;
      for (final Z t : this) {
        if (mN.add(t).isProbablePrime() || mN.subtract(t).isProbablePrime()) {
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

