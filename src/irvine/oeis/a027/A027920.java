package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000914;
import irvine.oeis.a000.A000915;

/**
 * A027920 Least k such that 2nd elementary symmetric function of {1,2,...,k} &gt;= 4th elementary symmetric function of {1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A027920 extends A000915 {

  /** Construct the sequence. */
  public A027920() {
    super(4);
  }

  private final Sequence mA = new A000914();
  private long mK = -1;

  @Override
  public Z next() {
    final Z t = super.next();
    while (mA.next().compareTo(t) < 0) {
      ++mK;
    }
    return Z.valueOf(++mK);
  }
}
