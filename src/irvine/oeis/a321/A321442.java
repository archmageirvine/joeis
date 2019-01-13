package irvine.oeis.a321;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A321442.
 * @author Sean A. Irvine
 */
public class A321442 implements Sequence {

  private Z mN = Z.ONE;

  private boolean isOddPowerOf2(final Z n) {
    final Z v = n.makeOdd();
    return Z.ONE.equals(v) && (n.auxiliary() & 1) == 1;
  }

  @Override
  public Z next() {
    mN = mN.add(2);
    if (Z.ONE.equals(mN)) {
      return Z.ZERO;
    }
    long c = 0;
    boolean jacksTurn = true;
    Set<Z> live = new HashSet<>();
    live.add(mN);
    while (true) {
      final Set<Z> next = new HashSet<>();
      for (final Z v : live) {
        if (jacksTurn && !Z.ONE.equals(v) && ((!v.isEven() && v.compareTo(mN) < 0) || isOddPowerOf2(v))) {
          return Z.valueOf(c / 2);
        }
        if (v.isEven()) {
          next.add(v.divide2());
        } else if (!Z.ONE.equals(v) && jacksTurn) {
          final Z t = v.multiply(3);
          next.add(t.add(1));
          next.add(t.subtract(1));
        }
      }
      live = next;
      //System.out.println(live);
      jacksTurn = !jacksTurn;
      ++c;
    }
  }
}
