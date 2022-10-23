package irvine.oeis.a196;

import java.util.HashMap;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;


/**
 * A196545 Number of weakly ordered plane trees with n leaves.
 * @author Sean A. Irvine
 */
public class A196545 extends Sequence1 {

  private final HashMap<Integer, Z> mCache = new HashMap<>();
  private int mN = 0;

  private Z count(final int n) {
    if (n <= 1) {
      return Z.ONE;
    }
    final Z r = mCache.get(n);
    if (r != null) {
      return r;
    }
    Z s = Z.ZERO;
    int[] p;
    final IntegerPartition part = new IntegerPartition(n);
    while ((p = part.next()) != null) {
      if (p.length > 1) {
        Z t = Z.ONE;
        for (int v : p) {
          t = t.multiply(count(v));
        }
        s = s.add(t);
      }
    }
    mCache.put(n, s);
    return s;
  }


  @Override
  public Z next() {
    return count(++mN);
  }
}
