package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004454 Nimsum n + 13.
 * @author Sean A. Irvine
 */
public class A004454 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 13);
  }
}

