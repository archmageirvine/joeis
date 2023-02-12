package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A061375 Integer part of geometric mean of first n positive integers.
 * @author Sean A. Irvine
 */
public class A061375 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().root((int) mN);
  }
}

