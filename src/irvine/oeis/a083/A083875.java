package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a072.A072294;

/**
 * A083875 One-sixth the areas of primitive Heronian triangles sorted.
 * @author Sean A. Irvine
 */
public class A083875 extends A072294 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mSafe = Z.ZERO;

  @Override
  protected Z select(final long a, final long b, final long c) {
    mSafe = Z.valueOf(b);
    return super.select(a, b, c);
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().multiply(6).compareTo(mSafe) > 0) {
      mA.add(super.next());
    }
    return mA.pollFirst().divide(6);
  }
}
