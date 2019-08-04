package irvine.oeis.a014;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a006.A006016;

/**
 * A014587 Nim function for <code>Take-a-Factorial-Game (a</code> subtraction game).
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
      moves.add(get(n - f).longValueExact());
      f *= ++r;
    }
    return Z.valueOf(A006016.mex(moves));
  }
}
