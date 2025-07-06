package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a123.A123744;

/**
 * A384080 a(n) = neg(M(n)), where M(n) is the n X n circulant matrix with (row 1) = (F(0), F(1), ..., F(n-1)), where F = A000045 (Fibonacci numbers), and neg(M(n)) is the negative part of the determinant of M(n); see A380661.
 * @author Sean A. Irvine
 */
public class A384080 extends Sequence1 {

  private long mN = -1;
  private final Sequence mD = new A123744().skip();
  private final Sequence mP = new A384079().skip();

  @Override
  public Z next() {
    return mD.next().multiply(Z.NEG_ONE.pow(++mN)).subtract(mP.next()).divide2();
  }
}

