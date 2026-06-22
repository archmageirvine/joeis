package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A085503 Sub-triangle of A008292: take every second term of every second row.
 * @author Sean A. Irvine
 */
public class A085503 extends A008292 {

  /** Construct the sequence. */
  public A085503() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(2 * mN - 1, 2 * mM - 1);
  }
}
