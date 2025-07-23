package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;

/**
 * A385712 allocated for John Tromp.
 * @author Sean A. Irvine
 */
public class A385712 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A385712() {
    super(1, NONCOMPUTABLE, Z.ZERO, Z.TWO, Z.ZERO, Z.FOUR, Z.FIVE, Z.SIX, Z.SEVEN, Z.valueOf(26), Z.NINE, Z.valueOf(36), Z.valueOf(41), Z.valueOf(266), Z.valueOf(51), new Z("2894802230932904885589274625217197696331749616641014100986439600197828240998436"));
  }
}
