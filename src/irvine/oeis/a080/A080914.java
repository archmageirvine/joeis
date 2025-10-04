package irvine.oeis.a080;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;

/**
 * A080914 A080900 sorted and duplicates removed.
 * @author Sean A. Irvine
 */
public class A080914 extends A080900 implements Conjectural {

  private static final int HEURISTIC = 1000;
  private Z mA = Z.ZERO;
  private final TreeSet<Z> mS = new TreeSet<>();

  @Override
  public Z next() {
    while (mS.size() < HEURISTIC) {
      mS.add(super.next());
    }
    final Z res = mS.pollFirst();
    if (res.compareTo(mA) < 0) {
      throw new RuntimeException("Heuristic failed: " + res + " should have been output earlier");
    }
    mA = res;
    return res;
  }
}

