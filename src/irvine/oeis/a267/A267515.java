package irvine.oeis.a267;

import irvine.math.z.Z;

/**
 * A267515 Decimal representation of the middle column of the "Rule 137" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267515 extends A267514 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 2);
  }
}
