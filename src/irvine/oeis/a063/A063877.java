package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A063877 Composite numbers not divisible by 7 which in base 7 contain their largest proper factor as a substring.
 * @author Sean A. Irvine
 */
public class A063877 extends A002808 {

  private final int mBase;

  protected A063877(final int base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A063877() {
    this(7);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(mBase) != 0) {
        final String v = t.toString(mBase);
        final Z[] d = Jaguar.factor(t).divisorsSorted();
        if (v.contains(d[d.length - 2].toString(mBase))) {
          return t;
        }
      }
    }
  }
}
