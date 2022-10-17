package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A060009 Ulam numbers starting with the numbers 1 and 9.
 * @author Sean A. Irvine
 */
public class A060009 extends A002858 {

  @Override
  protected Z a1() {
    return Z.ONE;
  }

  @Override
  protected Z a2() {
    return Z.NINE;
  }
}
