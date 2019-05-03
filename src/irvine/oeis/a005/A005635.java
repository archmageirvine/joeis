package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a122.A122693;
import irvine.oeis.a122.A122747;
import irvine.oeis.a122.A122748;
import irvine.oeis.a122.A122749;

/**
 * A005635 Number of ways of placing <code>n non-attacking</code> bishops on an <code>n X n</code> board so that every square is attacked <code>(or occupied)</code>.
 * @author Sean A. Irvine
 */
public class A005635 extends A122749 {

  private final Sequence mC = new A122693();
  private final Sequence mQ = new A122747();
  private final Sequence mM = new A122748();
  private long mN = -1;

  private Z e() {
    return mN < 2 ? Z.EIGHT : super.next();
  }

  private Z q() {
    return (mN & 7) != 1 ? Z.ZERO : mQ.next();
  }

  private Z c() {
    return (mN & 1) == 0 ? Z.ZERO : mC.next();
  }

  @Override
  public Z next() {
    ++mN;
    return e().add(c()).add(q().add(mM.next()).multiply2()).divide(8);
  }
}
