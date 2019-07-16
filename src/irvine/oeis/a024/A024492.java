package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024492.
 * @author Sean A. Irvine
 */
public class A024492 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Binomial.catalan(mN);
  }
}
