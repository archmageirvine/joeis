package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002582;

/**
 * A014442.
 * @author Sean A. Irvine
 */
public class A014442 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return A002582.lpf(Z.valueOf(++mN).square().add(1));
  }
}

