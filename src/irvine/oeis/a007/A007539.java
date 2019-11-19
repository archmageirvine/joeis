package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007539 <code>a(n) =</code> first n-fold perfect (or <code>n-multiperfect)</code> number.
 * @author Sean A. Irvine
 */
public class A007539 implements Sequence {

  // Only good for 4 terms or 5 if you wait for ages

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (!Cheetah.factor(++k).sigma().equals(Z.valueOf(mN * k))) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
