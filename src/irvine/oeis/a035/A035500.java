package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A035500 Shuffles at which new cards appear on top of deck in Guy's shuffling problem A035485.
 * @author Sean A. Irvine
 */
public class A035500 extends A035485 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (mSeen.add(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}

