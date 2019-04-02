package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;
import irvine.util.Pair;

/**
 * A007609 Values taken by the sigma(n) function A000203, sorted into ascending order.
 * @author Sean A. Irvine
 */
public class A007609 extends A000203 {

  private long mN = 0;
  private final TreeSet<Pair<Z, Long>> mA = new TreeSet<>((a, b) -> {
    final int c = a.left().compareTo(b.left());
    if (c != 0) {
      return c;
    }
    return a.right().compareTo(b.right());
  });

  private void step() {
    final Z t = super.next();
    mA.add(new Pair<>(t, ++mN));
  }

  @Override
  public Z next() {
    step();
    step();
    return mA.pollFirst().left();
  }
}
