package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A028398.
 * @author Sean A. Irvine
 */
public class A028398 extends A028397 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private long mN = -1;

  @Override
  protected void update(final Z n) {
    mSeen.add(n);
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (!mSeen.contains(n) && n.equals(min(n))) {
        return n;
      }
    }
  }
}

