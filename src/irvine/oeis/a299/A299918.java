package irvine.oeis.a299;
// manually rectoproc/holos at 2022-07-14 16:07

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A299918 Motzkin numbers (A001006) mod 8.
 * @author Georg Fischer
 */
public class A299918 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A299918() {
    super(0, "[[0],[-3, 3],[1, 2],[-2,-1]]", "[1, 1]", 0);
  }

  @Override
  public Z next() {
    return super.next().mod(Z.EIGHT);
  }
}
