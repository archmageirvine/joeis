package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A017530 (12n)^10.
 * @author Sean A. Irvine
 */
public class A017530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017530() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.ZERO, Z.valueOf(61917364224L), Z.valueOf(63403380965376L), Z.valueOf(3656158440062976L), Z.valueOf(64925062108545024L), Z.valueOf(604661760000000000L), Z.valueOf(3743906242624487424L), new Z("17490122876598091776"), new Z("66483263599150104576"), new Z("215892499727278669824"), new Z("619173642240000000000")});
  }
}
