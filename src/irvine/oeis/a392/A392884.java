package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A392884 a(n) is the minimum total surface area of four-element sets of distinct integer-sided cuboids that fill an n X n X n cube.
 * @author Sean A. Irvine
 */
public class A392884 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(8).add(2).multiply(mN).add(2);
  }
}

