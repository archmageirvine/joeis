package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a001.A001519;

/**
 * A036796 Integers that can be decomposed into sums of different Fibonacci numbers of odd argument.
 * @author Sean A. Irvine
 */
public class A036796 extends A036795 {

  @Override
  protected Sequence source() {
    return new A001519();
  }
}
