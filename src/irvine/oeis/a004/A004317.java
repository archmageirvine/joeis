package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004317.
 * @author Sean A. Irvine
 */
public class A004317 implements Sequence {

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 11);
  }
}

