package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033432 <code>a(n) = floor(1000/sqrt(n))</code>.
 * @author Sean A. Irvine
 */
public class A033432 implements Sequence {

  private static final CR NUM = CR.valueOf(1000);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(CR.valueOf(++mN).sqrt()).floor();
  }
}

