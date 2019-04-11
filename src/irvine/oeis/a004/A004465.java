package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004465 Nimsum <code>n + 24</code>.
 * @author Sean A. Irvine
 */
public class A004465 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 24);
  }
}

