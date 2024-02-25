package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002805;
import irvine.oeis.a007.A007409;

/**
 * A068589 Denominator(Sum_{i=1..n} 1/i^3)/denominator(Sum_{i=1..n} 1/i).
 * @author Georg Fischer
 */
public class A068589 extends Sequence1 {

  final Sequence mA002805 = new A002805();
  final Sequence mA007409 = new A007409();

  @Override
  public Z next() {
    return mA007409.next().divide(mA002805.next());
  }
}
