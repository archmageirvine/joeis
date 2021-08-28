package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051191 2^(2^n-2).
 * @author Sean A. Irvine
 */
public class A051191 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft((1 << ++mN) - 2);
  }
}
