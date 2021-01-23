package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007320 Number of steps needed for juggler sequence (A094683) started at n to reach 1.
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
