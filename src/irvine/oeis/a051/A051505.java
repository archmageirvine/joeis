package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051505 a(n) = min { 2^n, floor(100/sqrt(n)) }.
 * @author Sean A. Irvine
 */
public class A051505 implements Sequence {

  private static final CR CR100 = CR.valueOf(100);
  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= 5 ? Z.ONE.shiftLeft((int) mN) : CR100.divide(CR.valueOf(mN).sqrt()).floor();
  }
}

