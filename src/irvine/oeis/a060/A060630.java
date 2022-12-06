package irvine.oeis.a060;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a053.A053392;

/**
 * A060630 a(n) gives smallest number requiring n iterations of the map i -&gt; A053392(i) to reach zero.
 * @author Sean A. Irvine
 */
public class A060630 extends A053392 {

  // Somewhat tricky because some numbers like 1496 apparently increase without limit

  private TreeMap<Z, Z> mIncomplete = new TreeMap<>();
  private int mN = -1;
  private Z mM = Z.NEG_ONE;

  @Override
  public Z next() {
    ++mN;
    // Step all currently incomplete
    final TreeMap<Z, Z> stillIncomplete = new TreeMap<>();
    Z soln = null;
    for (final Map.Entry<Z, Z> e : mIncomplete.entrySet()) {
      final Z t = step(e.getValue());
      if (t.isZero()) {
        if (soln == null) {
          soln = e.getKey();
        }
      } else {
        stillIncomplete.put(e.getKey(), t);
      }
    }
    mIncomplete = stillIncomplete;
    outer:
    while (soln == null) {
      mM = mM.add(1);
      Z t = mM;
      for (int k = 1; k <= mN; ++k) {
        t = step(t);
        if (t.isZero() && k < mN) {
          // not interesting
          continue outer;
        }
      }
      if (t.isZero()) {
        soln = mM;
        break;
      }
      stillIncomplete.put(mM, t);
    }
    return soln;
  }
}
