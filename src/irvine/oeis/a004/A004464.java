package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004464 Nimsum <code>n + 23</code>.
 * @author Sean A. Irvine
 */
public class A004464 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 23);
  }
}

