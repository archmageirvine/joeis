package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036435 Digits are nonzero squares.
 * @author Sean A. Irvine
 */
public class A036435 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ONE);
    mA.add(Z.FOUR);
    mA.add(Z.NINE);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final Z t = res.multiply(10);
    mA.add(t.add(1));
    mA.add(t.add(4));
    mA.add(t.add(9));
    return res;
  }
}
