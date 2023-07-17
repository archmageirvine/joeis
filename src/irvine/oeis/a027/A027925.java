package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000537;
import irvine.oeis.a000.A000914;

/**
 * A027925 a(n) = least k such that E{1,2,...,k} &gt;= 1^3 + 2^3 + ... + n^3, where E = 2nd elementary symmetric function.
 * @author Sean A. Irvine
 */
public class A027925 extends A000537 {

  /** Construct the sequence. */
  public A027925() {
    super(1);
  }

  private final Sequence mA = new A000914();
  private Z mT = Z.NEG_ONE;
  private long mK = -1;

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    while (mT.compareTo(t) < 0) {
      mT = mA.next();
      ++mK;
    }
    return Z.valueOf(mK);
  }
}
