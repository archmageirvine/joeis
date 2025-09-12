package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000523;

/**
 * A080301 Local ranking function for totally balanced binary sequences: if n's binary expansion is totally balanced (A080116(n)=1), then a(n) is its zero-based position among A000108((A000523(n)+1)/2) lexicographically ordered totally balanced binary sequences of the same width, otherwise -1.
 * @author Sean A. Irvine
 */
public class A080301 extends A080116 {

  private final Sequence mA = new A000523();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z a = mA.next();
    return super.next().isZero() ? Z.NEG_ONE : Functions.LOCAL_CATALAN_RANK.z(a.add(1).divide2(), mN);
  }
}

