package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004449 Nimsum <code>n + 8</code>.
 * @author Sean A. Irvine
 */
public class A004449 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 8);
  }
}

