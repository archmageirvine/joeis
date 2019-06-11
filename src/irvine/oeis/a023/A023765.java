package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023765.
 * @author Sean A. Irvine
 */
public class A023765 implements Sequence {

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
      return Z.ZERO;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(9);
    for (long k = a.mod(9); k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

