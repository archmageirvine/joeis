package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045927 Digits even, nonzero and nondecreasing.
 * @author Sean A. Irvine
 */
public class A045927 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.TWO);
    mA.add(Z.FOUR);
    mA.add(Z.SIX);
    mA.add(Z.EIGHT);
  }

  @Override
  public Z next() {
    final Z t = mA.pollFirst();
    final Z t10 = t.multiply(10);
    for (long r = t.mod(10); r < 10; r += 2) {
      mA.add(t10.add(r));
    }
    return t;
  }
}
