package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004452 Nimsum n + 11.
 * @author Sean A. Irvine
 */
public class A004452 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 11);
  }
}

