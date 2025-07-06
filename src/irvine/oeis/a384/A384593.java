package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a123.A123745;

/**
 * A384593 a(n) = pos(M(n)), where M(n) is the n X n circulant matrix with (row 1) = (F(1), F(2), ..., F(n)), where F = A000045 (Fibonacci numbers), and neg(M(n)) is the negative part of the determinant of M(n); see A380661.
 * @author Sean A. Irvine
 */
public class A384593 extends Sequence1 {

  private long mN = -1;
  private final Sequence mD = new A123745();
  private final Sequence mP = new A384591().skip();

  @Override
  public Z next() {
    return mD.next().multiply(Z.NEG_ONE.pow(++mN)).add(mP.next()).divide2();
  }
}

