package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004460 Nimsum n + 19.
 * @author Sean A. Irvine
 */
public class A004460 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 19);
  }
}

