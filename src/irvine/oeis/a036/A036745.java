package irvine.oeis.a036;

import java.util.ArrayList;
import java.util.List;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A036745 Squares including each digit exactly once.
 * @author Sean A. Irvine
 */
public class A036745 extends FiniteSequence {

  private static List<Z> build() {
    final ArrayList<Z> lst = new ArrayList<>();
    for (long k = 32043; k <= 99066; ++k) {
      final long s = k * k;
      if (LongUtils.syndrome(s) == 0b1111111111) {
        lst.add(Z.valueOf(s));
      }
    }
    return lst;
  }

  /** Construct the sequence. */
  public A036745() {
    super(build());
  }
}
