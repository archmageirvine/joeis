package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000065 <code>-1 +</code> number of partitions of n.
 * @author Sean A. Irvine
 */
public class A000065 extends A000041 {

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE);
  }
}

