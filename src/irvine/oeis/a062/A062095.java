package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062095 a(1) = 1, a(n) = concatenation of two closest factors of a(n-1) whose product equals a(n-1) or if a(n-1) is a prime then the concatenation of 1 and a(n-1).
 * @author Sean A. Irvine
 */
public class A062095 extends Sequence1 {

  private final long mStart;
  private Z mA = null;

  protected A062095(final long start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A062095() {
    this(1);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(mStart);
    } else {
      final Z[] d = Jaguar.factor(mA).divisorsSorted();
      if ((d.length & 1) == 1) {
        final String s = d[d.length / 2].toString();
        mA = new Z(s + s);
      } else {
        mA = new Z(d[d.length / 2 - 1].toString() + d[d.length / 2]);
      }
    }
    return mA;
  }
}
