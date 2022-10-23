package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004465 Nimsum n + 24.
 * @author Sean A. Irvine
 */
public class A004465 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 24);
  }
}

