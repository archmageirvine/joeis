package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004462 Nimsum n + 21.
 * @author Sean A. Irvine
 */
public class A004462 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 21);
  }
}

