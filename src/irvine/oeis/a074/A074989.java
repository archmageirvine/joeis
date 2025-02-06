package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A074989 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).root(3);
    final Z s3 = s.pow(3);
    final Z t3 = s.add(1).pow(3);
    return s3.subtract(mN).abs().min(t3.subtract(mN).abs());
  }
}

