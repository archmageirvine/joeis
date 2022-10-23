package irvine.oeis.a046;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046287 Numbers k such that 2^k contains 2^1=2 as its largest proper substring of the form 2^m (probably finite).
 * @author Sean A. Irvine
 */
public class A046287 extends Sequence1 {

  private final ArrayList<String> mS = new ArrayList<>();
  private Z mA = Z.ONE;
  private long mN = 0;

  protected int target() {
    return 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply2();
      final String s = mA.toString();
      int k = mS.size();
      while (--k >= 0 && !s.contains(mS.get(k))) {
        // do nothing
      }
      mS.add(s);
      if (k == target()) {
        return Z.valueOf(mN);
      }
    }
  }
}
