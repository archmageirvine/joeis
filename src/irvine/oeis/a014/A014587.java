package irvine.oeis.a014;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A014587 Nim function for Take-a-Factorial-Game (a subtraction game).
 * @author Sean A. Irvine
 */
public class A014587 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    final Collection<Long> moves = new ArrayList<>();
    int r = 1;
    int f = 1;
    while (f <= n) {
      moves.add(a(n - f).longValueExact());
      f *= ++r;
    }
    return Z.valueOf(LongUtils.mex(moves));
  }
}
