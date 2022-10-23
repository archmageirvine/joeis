package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004457 Nimsum n + 16.
 * @author Sean A. Irvine
 */
public class A004457 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 16);
  }
}

