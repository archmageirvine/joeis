package irvine.oeis.a062;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062681 Numbers that are sums of 2 or more consecutive squares in more than 1 way.
 * @author Sean A. Irvine
 */
public class A062681 extends Sequence1 {

  private final TreeMap<Z, List<Long>> mA = new TreeMap<>();
  private long mN = 2;
  private Z mS;
  private final long mPower;

  protected A062681(final int power) {
    mPower = power;
    augment(Z.ONE, 1L);
    mS = Z.valueOf(mN).pow(power);
  }

  /** Construct the sequence. */
  public A062681() {
    this(2);
  }

  private void augment(final Z n, final long b) {
    final List<Long> lst = mA.get(n);
    if (lst != null) {
      lst.add(b);
    } else {
      final ArrayList<Long> newList = new ArrayList<>();
      newList.add(b);
      mA.put(n, newList);
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (mS.compareTo(mA.firstKey()) <= 0) {
        augment(mS, mN);
        mS = Z.valueOf(++mN).pow(mPower);
      }
      int cnt = 0;
      final Map.Entry<Z, List<Long>> e = mA.pollFirstEntry();
      final Z sum = e.getKey();
      for (final long v : e.getValue()) {
        if (!Z.valueOf(v).pow(mPower).equals(sum)) {
          ++cnt;
        }
        augment(sum.add(Z.valueOf(v + 1).pow(mPower)), v + 1);
      }
      if (cnt > 1) {
        return sum;
      }
    }
  }
}
