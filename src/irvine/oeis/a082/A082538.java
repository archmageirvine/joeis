package irvine.oeis.a082;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082538 Number of numbers k which give 1 after applying exactly n iterations of the 3k+1 algorithm (if a number is even, divide it by 2; if it is odd, multiply by 3 and add 1). This total includes numbers k which also give 1 for a smaller number of iterations (i.e., for this sequence we do not assume the algorithm halts when 1 is reached).
 * @author Sean A. Irvine
 */
public class A082538 extends Sequence0 {

  private Set<Z> mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Collections.singleton(Z.ONE);
    } else {
      final HashSet<Z> next = new HashSet<>();
      for (final Z v : mA) {
        next.add(v.multiply2());
        if (v.mod(6) == 4) {
          next.add(v.subtract(1).divide(3));
        }
      }
      mA = next;
    }
    return Z.valueOf(mA.size());
  }
}
