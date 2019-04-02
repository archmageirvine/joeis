package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004461 Nimsum n + 20.
 * @author Sean A. Irvine
 */
public class A004461 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 20);
  }
}

