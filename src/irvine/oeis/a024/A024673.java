package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024673 Position of 1 + n^3 in A024670 (distinct sums of cubes of distinct positive integers).
 * @author Sean A. Irvine
 */
public class A024673 extends A024670 {

  /** Construct the sequence. */
  public A024673() {
    super(2);
  }

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).pow(3).add(1);
    while (true) {
      ++mN;
      if (t.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
