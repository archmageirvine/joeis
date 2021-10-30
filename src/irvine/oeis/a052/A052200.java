package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052200 Number of n-state, 2-symbol, d+ in {LEFT, RIGHT}, 5-tuple (q, s, q+, s+, d+) (halting or not) Turing machines.
 * @author Sean A. Irvine
 */
public class A052200 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(4 * (++mN + 1)).pow(2 * mN);
  }
}
