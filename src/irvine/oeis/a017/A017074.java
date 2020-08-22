package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017074 a(n) = (8*n)^10.
 * @author Sean A. Irvine
 */
public class A017074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017074() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.ZERO, Z.valueOf(1073741824), Z.valueOf(1099511627776L), Z.valueOf(63403380965376L), Z.valueOf(1125899906842624L), Z.valueOf(10485760000000000L), Z.valueOf(64925062108545024L), Z.valueOf(303305489096114176L), Z.valueOf(1152921504606846976L), Z.valueOf(3743906242624487424L), new Z("10737418240000000000")});
  }
}
