package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000239 One-half of number of permutations of [n] with exactly one run of adjacent symbols differing by 1.
 * @author Sean A. Irvine
 */
public class A000239 extends A000130 {

  /** Construct the sequence. */
  public A000239() {
    super.next();
  }

  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(super.next());
    return mS.max(Z.ONE);
  }
}
