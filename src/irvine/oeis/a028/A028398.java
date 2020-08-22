package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A028398 When map in A006368 is iterated, all numbers fall into cycles; order cycles by smallest entry; a(n) is smallest entry in n-th cycle (some cycles are infinite).
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

