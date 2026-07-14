package irvine.oeis.a085;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A085847 Members of A085844 which are permutations of other members of A085844.
 * @author Sean A. Irvine
 */
public class A085847 extends A085844 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final HashMap<Z, List<Z>> mS = new HashMap<>();
  private Z mN = super.next();
  private Z mLim = Z.ONE;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mS.clear();
      mLim = mLim.multiply(10);
      while (mN.compareTo(mLim) < 0) {
        final Z key = Functions.DIGIT_SORT_DESCENDING.z(mN);
        final List<Z> lst = mS.get(key);
        if (lst != null) {
          lst.add(mN);
        } else {
          final ArrayList<Z> newList = new ArrayList<>();
          newList.add(mN);
          mS.put(key, newList);
        }
        mN = super.next();
      }
      for (final List<Z> lst : mS.values()) {
        if (lst.size() > 1) {
          mA.addAll(lst);
        }
      }
    }
    return mA.pollFirst();
  }
}
