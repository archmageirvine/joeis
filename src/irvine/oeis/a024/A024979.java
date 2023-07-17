package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024979 Position of n^3 + 9 in A024975.
 * @author Sean A. Irvine
 */
public class A024979 extends A024975 {

  /** Construct the sequence. */
  public A024979() {
    super(3);
  }

  private long mM = 2;
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).pow(3).add(9);
    while (true) {
      ++mN;
      if (super.next().equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
