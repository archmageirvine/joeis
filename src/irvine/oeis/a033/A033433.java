package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033433 [ 10000/sqrt(n) ].
 * @author Sean A. Irvine
 */
public class A033433 implements Sequence {

  private static final CR NUM = CR.valueOf(10000);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(CR.valueOf(++mN).sqrt()).floor();
  }
}

