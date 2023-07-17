package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a008.A008970;

/**
 * A000506 One half of the number of permutations of [n] such that the differences have 5 runs with the same signs.
 * @author Sean A. Irvine
 */
public class A000506 extends A008970 {

  /** Construct the sequence. */
  public A000506() {
    super(6);
  }

  private int mN = 4;

  @Override
  public Z next() {
    return get(++mN, 5).divide2();
  }
}
