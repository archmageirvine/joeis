package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062879 Integers whose Zeckendorf expansion does not contain ones at even positions.
 * @author Sean A. Irvine
 */
public class A062879 extends A062877 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}

