package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004455 Nimsum <code>n + 14</code>.
 * @author Sean A. Irvine
 */
public class A004455 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 14);
  }
}

