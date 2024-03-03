package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A068590.
 * @author Sean A. Irvine
 */
public class A068618 extends Sequence1 {

  private final Sequence mTriangular;
  private Z mA = null;

  protected A068618(final Sequence seq) {
    mTriangular = seq;
  }

  /** Construct the sequence. */
  public A068618() {
    this(new A000217().skip());
  }

  private boolean is(Z b, Z a) {
    Z[] qb = b.divideAndRemainder(Z.TEN);
    while (a.compareTo(b) > 0) {
      final Z[] qa = a.divideAndRemainder(Z.TEN);
      a = qa[0];
      if (qa[1].equals(qb[1])) {
        b = qb[0];
        qb = qb[0].divideAndRemainder(Z.TEN);
      }
    }
    return a.equals(b);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mTriangular.next();
    } else {
      while (true) {
        final Z t = mTriangular.next();
        if (is(mA, t)) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
