package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;

/**
 * A071101.
 * @author Sean A. Irvine
 */
public class A071107 extends NoncomputableSequence {

  // Next term too large to be represented

  /** Construct the sequence. */
  public A071107() {
    super(1, NONCOMPUTABLE, Z.ONE, Z.THREE, Z.valueOf(27), new Z("115792089237316195423570985008687907853269984665640564039457584007913129639936"));
  }
}
