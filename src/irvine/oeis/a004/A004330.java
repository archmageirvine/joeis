package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004330.
 * @author Sean A. Irvine
 */
public class A004330 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 12);
  }
}

