package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014551 Jacobsthal-Lucas numbers.
 * @author Sean A. Irvine
 */
public class A014551 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).signedAdd((mN & 1) == 0, Z.ONE);
  }
}
