package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048563 a(n+1) is next smallest nontrivial cube beginning with a(n), initial cube is 1.
 * @author Sean A. Irvine
 */
public class A048563 extends Sequence0 {

  private Z mA = null;
  private final Z mStart;

  protected A048563(final Z start) {
    super();
    mStart = start;
  }

  /** Construct the sequence. */
  public A048563() {
    this(Z.ONE);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
    } else {
      Z u = mA;
      while (true) {
        u = u.multiply(10);
        final String s = mA.toString();
        final Z sqrt = ComputableReals.SINGLETON.pow(CR.valueOf(u), CR.ONE_THIRD).ceil();
        Z t = sqrt.pow(3);
        if (t.equals(u)) {
          t = sqrt.add(1).pow(3);
        }
        if (t.toString().startsWith(s)) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
