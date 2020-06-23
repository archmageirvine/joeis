package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032532 Integer part of decimal <code>'base-2</code> looking' numbers divided by their actual <code>base-2</code> values (denominator of <code>a(n)</code> is n, numerator is n written in binary but read in decimal).
 * @author Sean A. Irvine
 */
public class A032532 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 2)).divide(mN);
  }
}
