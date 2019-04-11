package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004443 Nimsum <code>n + 2</code>.
 * @author Sean A. Irvine
 */
public class A004443 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 2);
  }
}

