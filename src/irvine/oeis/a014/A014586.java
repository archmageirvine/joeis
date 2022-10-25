package irvine.oeis.a014;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A014586 Nim-Grundy function for Take-a-Square (or Subtract-a-Square) game.
 * @author Sean A. Irvine
 */
public class A014586 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    final Collection<Long> moves = new ArrayList<>();
    for (int r = 1; r <= IntegerUtils.sqrt(n); ++r) {
      moves.add(a(n - r * r).longValueExact());
    }
    return Z.valueOf(LongUtils.mex(moves));
  }
}
