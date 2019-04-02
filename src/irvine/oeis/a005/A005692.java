package irvine.oeis.a005;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005692 Shortest wins at Beanstalk.
 * @author Sean A. Irvine
 */
public class A005692 implements Sequence {

  private Z mN = Z.NEG_ONE;

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
    while (jacksTurn || !live.contains(Z.ONE)) {
      final Set<Z> next = new HashSet<>();
      for (final Z v : live) {
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
    return Z.valueOf(c);
  }
}
