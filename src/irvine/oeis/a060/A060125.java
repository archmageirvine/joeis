package irvine.oeis.a060;

import java.util.HashMap;
import java.util.LinkedList;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060125 Self-inverse infinite permutation which shows the position of the inverse of each finite permutation in A060117 (or A060118) in the same sequence; or equally, the cross-indexing between A060117 and A060118.
 * @author Sean A. Irvine
 */
public class A060125 extends Sequence0 {

  private int mN = -1;
  private final HashMap<String, Integer> mMap = new HashMap<>();
  private final LinkedList<IntegerPermutation> mLst = new LinkedList<>();

  @Override
  public Z next() {
    if (mLst.isEmpty()) {
      final int r = ++mN;
      final IntegerPermutation perm = IntegerPermutation.permUnrank3R(r);
      final String key = perm.toString();
      mMap.put(key, mN);
      mLst.add(perm);
    }
    final String inv = mLst.pollFirst().inverse().toString();
    while (!mMap.containsKey(inv)) {
      final int r = ++mN;
      final IntegerPermutation perm = IntegerPermutation.permUnrank3R(r);
      final String key = perm.toString();
      mMap.put(key, mN);
      mLst.add(perm);
    }
    return Z.valueOf(mMap.get(inv));
  }
}
