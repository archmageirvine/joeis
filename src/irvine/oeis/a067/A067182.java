package irvine.oeis.a067;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A067182 Smallest Fibonacci number with digit sum n, or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A067182 extends A000045 {

  private final HashMap<Long, Z> mFirstSolutions = new HashMap<>();
  private long mN = -1;

  private void step() {
    final Z f = super.next();
    final long d = Functions.DIGIT_SUM.l(f);
    if (!mFirstSolutions.containsKey(d)) {
      mFirstSolutions.put(d, f);
      if (d <= mN) {
        throw new RuntimeException("Heuristic failed: found solution: " + f + " for " + d);
      }
    }
  }

  @Override
  public Z next() {
    // Heuristic, we will find the solution within 2 * Fibonacci numbers.
    // We will detect if this is every violated
    step();
    step();
    final Z res = mFirstSolutions.get(++mN);
    return res == null ? Z.NEG_ONE : res;
  }
}

