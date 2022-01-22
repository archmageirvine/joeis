package irvine.oeis.a014;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;

/**
 * A014589 Nim function for Take-a-Prime (or Subtract-a-Prime) Game.
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
    return Z.valueOf(LongUtils.mex(moves));
  }
}
