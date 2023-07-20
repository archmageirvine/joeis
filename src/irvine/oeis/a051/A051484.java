package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A051484 a(n) is the next natural number (besides 1) which is not congruent to a(i) mod a(j) for any i &lt; j &lt; n.
 * @author Sean A. Irvine
 */
public class A051484 extends MemorySequence {

  {
    setOffset(1);
  }

  private Z mM = Z.ONE;

  private boolean contains(final Z n) {
    for (int k = 0; k < size(); ++k) {
      if (a(k).equals(n)) {
        return true;
      }
    }
    return false;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    outer:
    while (true) {
      mM = mM.add(1);
      for (int j = 1; j < n; ++j) {
        final Z mod = a(j);
        final Z t = mM.mod(mod);
        if (contains(t)) {
          continue outer;
        }
      }
      return mM;
    }
  }
}
