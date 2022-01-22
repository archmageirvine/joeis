package irvine.oeis.a014;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000045;

/**
 * A014588 Nim function for Take-a-Fibonacci-Game (a subtraction game).
 * @author Sean A. Irvine
 */
public class A014588 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    final Collection<Long> moves = new ArrayList<>();
    final A000045 fibo = new A000045();
    fibo.next();
    for (int f = fibo.next().intValueExact(); f <= n; f = fibo.next().intValueExact()) {
      moves.add(get(n - f).longValueExact());
    }
    return Z.valueOf(LongUtils.mex(moves));
  }
}
