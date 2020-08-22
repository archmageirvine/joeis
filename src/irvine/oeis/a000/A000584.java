package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000584 Fifth powers: a(n) = n^5.
 * @author Sean A. Irvine
 */
public class A000584 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(5);
  }
}

