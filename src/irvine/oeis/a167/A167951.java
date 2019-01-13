package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167951.
 * @author Sean A. Irvine
 */
public class A167951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167951() {
    super(new long[] {-561, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33},
      new Z[] {Z.ONE, Z.valueOf(35), Z.valueOf(1190), Z.valueOf(40460), Z.valueOf(1375640), Z.valueOf(46771760), Z.valueOf(1590239840), Z.valueOf(54068154560L), Z.valueOf(1838317255040L), Z.valueOf(62502786671360L), Z.valueOf(2125094746826240L), Z.valueOf(72253221392092160L), Z.valueOf(2456609527331133440L), new Z("83524723929258536960"), new Z("2839840613594790256640"), new Z("96554580862222868725760")});
  }
}
