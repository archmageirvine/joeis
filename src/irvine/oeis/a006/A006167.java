package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001037;
import irvine.oeis.transform.EulerTransform;

/**
 * A006167 Number of factorization patterns of polynomials of degree n over F_2.
 * @author Sean A. Irvine
 */
public class A006167 extends EulerTransform {

  /** Construct the sequence. */
  public A006167() {
    this(new A001037());
  }

  protected A006167(final Sequence underSequence) {
    super(1, new Sequence0() {
      private final ArrayList<Z> mA = new ArrayList<>();
      private Z mN = Z.ZERO;

      private Z getA(final int d) {
        while (d >= mA.size()) {
          mA.add(underSequence.next());
        }
        return mA.get(d);
      }

      @Override
      public Z next() {
        mN = mN.add(1);
        Z sum = Z.ZERO;
        for (final Z dd : Jaguar.factor(mN).divisors()) {
          final int d = dd.intValue();
          if (getA(d).compareTo(mN.divide(dd)) >= 0) {
            sum = sum.add(1);
          }
        }
        return sum;
      }
    }, 0);
    next();
  }
}

