package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A002730 Number of equivalence classes of binary sequences of primitive period n.
 * @author Sean A. Irvine
 */
public class A002730 extends A002729 {

  /** Construct the sequence. */
  public A002730() {
    super(1);
  }

  private final ArrayList<Z> mA2729 = new ArrayList<>();

  {
    mA2729.add(super.next());
  }

  @Override
  public Z next() {
    final int n = mA2729.size();
    mA2729.add(super.next());
    Z s = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValueExact();
      s = s.add(mA2729.get(d).multiply(Functions.MOBIUS.i((long) (n / d))));
    }
    return s;
  }
}
