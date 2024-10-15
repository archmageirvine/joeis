package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005651;

/**
 * A072605 Number of necklaces with n beads over an n-ary alphabet {a1,a2,...,an} such that #(w,a1) &gt;= #(w,a2) &gt;= ... &gt;= #(w,ak) &gt;= 0, where #(w,x) counts the letters x in word w.
 * @author Sean A. Irvine
 */
public class A072605 extends Sequence0 {

  private int mN = -1;
  private final DirectSequence mA = DirectSequence.create(new A005651());

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Integers.SINGLETON.sumdiv(mN, d -> Functions.PHI.z(mN / d).multiply(mA.a(d))).divide(mN);
  }
}
