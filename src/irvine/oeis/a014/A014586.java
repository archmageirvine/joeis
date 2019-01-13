package irvine.oeis.a014;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a006.A006016;

/**
 * A014586.
 * @author Sean A. Irvine
 */
public class A014586 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    final Collection<Long> moves = new ArrayList<>();
    for (int r = 1; r <= IntegerUtils.sqrt(n); ++r) {
      moves.add(get(n - r * r).longValueExact());
    }
    return Z.valueOf(A006016.mex(moves));
  }
}
