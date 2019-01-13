package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000579.
 * @author Sean A. Irvine
 */
public class A000579 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6);
  }
}

