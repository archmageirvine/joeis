package irvine.oeis.a076;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a053.A053810;

/**
 * A076600.
 * @author Sean A. Irvine
 */
public class A076705 extends A053810 {

  private static final Z LIMIT = Z.valueOf(900); // Enough for 100 digit answers.
  private final HashSet<Z> mPP = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      if (pp.compareTo(LIMIT) <= 0) {
        mPP.add(pp);
      }
      if (mPP.contains(Functions.DIGIT_SUM.z(pp))) {
        return pp;
      }
    }
  }
}
