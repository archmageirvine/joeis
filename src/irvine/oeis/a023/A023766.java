package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023766.
 * @author Sean A. Irvine
 */
public class A023766 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
      mA.add(Z.TWO);
      mA.add(Z.THREE);
      mA.add(Z.FOUR);
      mA.add(Z.FIVE);
      mA.add(Z.SIX);
      mA.add(Z.SEVEN);
      mA.add(Z.EIGHT);
      mA.add(Z.NINE);
      mA.add(Z.TEN);
      return Z.ZERO;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(11);
    for (long k = a.mod(11); k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

