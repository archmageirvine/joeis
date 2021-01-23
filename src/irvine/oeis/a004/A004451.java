package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004451 Nimsum n + 10.
 * @author Sean A. Irvine
 */
public class A004451 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 10);
  }
}

