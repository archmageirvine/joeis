package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007613 <code>(8^n + 2(-1)^n )/3</code>.
 * @author Sean A. Irvine
 */
public class A007613 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(3 * ++mN).signedAdd((mN & 1) == 0, Z.TWO).divide(3);
  }
}
