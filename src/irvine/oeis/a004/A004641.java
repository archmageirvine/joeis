package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a001.A001030;

/**
 * A004641 Fixed under 0 -&gt; 10, 1 -&gt; 100.
 * @author Sean A. Irvine
 */
public class A004641 extends A001030 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

