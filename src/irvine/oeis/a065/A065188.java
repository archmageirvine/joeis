package irvine.oeis.a065;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065188 "Greedy Queens" permutation of the positive integers.
 * @author Sean A. Irvine
 */
public class A065188 extends Sequence1 {

  // After M. F. Hasler

  private final List<Integer> mA = new ArrayList<>();
  private final TreeSet<Integer> mU = new TreeSet<>();
  {
    mU.add(0);
  }
  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int x = mU.first();
    outer:
    while (true) {
      ++x;
      if (!mU.contains(x)) {
        for (int i = 0; i < mA.size(); ++i) {
          if (Math.abs(x - mA.get(i)) == mN - i - 1) {
            continue outer;
          }
        }
        mU.add(x);
        int y = x;
        while (!mU.isEmpty() && mU.first() == y + 1) {
          y = mU.pollFirst();
        }
        mU.add(y);
        mA.add(x);
        return Z.valueOf(x);
      }
    }
  }
}
