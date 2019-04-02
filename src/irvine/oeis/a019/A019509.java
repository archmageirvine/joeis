package irvine.oeis.a019;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a006.A006016;

/**
 * A019509 Nim-values for the impartial game Take-a-Triangle.
 * @author Sean A. Irvine
 */
public class A019509 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    final Collection<Long> moves = new ArrayList<>();
    final A000217 triangle = new A000217();
    triangle.next();
    for (int f = triangle.next().intValueExact(); f <= n; f = triangle.next().intValueExact()) {
      moves.add(get(n - f).longValueExact());
    }
    return Z.valueOf(A006016.mex(moves));
  }
}
