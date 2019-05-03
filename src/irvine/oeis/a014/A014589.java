package irvine.oeis.a014;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a006.A006016;

/**
 * A014589 Nim function for <code>Take-a-Prime</code> (or <code>Subtract-a-Prime)</code> Game.
 * @author Sean A. Irvine
 */
public class A014589 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    final Collection<Long> moves = new ArrayList<>();
    final A000040 primes = new A000040();
    for (int f = primes.next().intValueExact(); f <= n; f = primes.next().intValueExact()) {
      moves.add(get(n - f).longValueExact());
    }
    return Z.valueOf(A006016.mex(moves));
  }
}
