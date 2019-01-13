package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007320.
 * @author Sean A. Irvine
 */
public class A007320 implements Sequence {

  private long mN = 0;

  protected Z juggler(final Z n) {
    return n.isEven() ? n.sqrt() : n.pow(3).sqrt();
  }

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    long count = 0;
    while (!Z.ONE.equals(n)) {
      n = juggler(n);
      ++count;
    }
    return Z.valueOf(count);
  }
}
