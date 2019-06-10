package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023758.
 * @author Sean A. Irvine
 */
public class A023758 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
      return Z.ZERO;
    }
    final Z a = mA.pollFirst();
    final Z a2 = a.multiply2();
    mA.add(a2);
    if (a.testBit(0)) {
      mA.add(a2.add(1));
    }
    return a;
  }
}

