package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A139803 <code>A033875(n) + 2^a(n) = A033875(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A139803 implements Sequence {

  private Z mA = Z.TWO;

  @Override
  public Z next() {
    Z t = Z.ONE;
    long k = 0;
    while (!mA.add(t).isProbablePrime()) {
      t = t.multiply2();
      ++k;
    }
    mA = mA.add(t);
    return Z.valueOf(k);
  }
}
