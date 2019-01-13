package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000093.
 * @author Sean A. Irvine
 */
public class A000093 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.square().multiply(n).sqrt();
  }
}

