package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Roman;

/**
 * A073421 Roman numerals for n evaluated as if in base 36.
 * @author Sean A. Irvine
 */
public class A073421 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return new Z(Roman.roman(++mN), 36);
  }
}

