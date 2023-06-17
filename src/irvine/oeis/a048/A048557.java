package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048557 a(1) = 1; a(n+1) is next smallest nontrivial square beginning with a(n).
 * @author Sean A. Irvine
 */
public class A048557 extends AbstractSequence {

  private Z mA = null;
  private final Z mStart;

  protected A048557(final Z start) {
    super(1);
    mStart = start;
  }

  /** Construct the sequence. */
  public A048557() {
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
        final Z sqrt = CR.valueOf(u).sqrt().ceil();
        Z t = sqrt.square();
        if (t.equals(u)) {
          t = sqrt.add(1).square();
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
