package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017410 <code>(11n+1)^10</code>.
 * @author Sean A. Irvine
 */
public class A017410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017410() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {
        Z.ONE,
        Z.valueOf(61917364224L),
        Z.valueOf(41426511213649L),
        Z.valueOf(2064377754059776L),
        Z.valueOf(34050628916015625L),
        Z.valueOf(303305489096114176L),
        Z.valueOf(1822837804551761449L),
        Z.valueOf(8335775831236199424L),
        new Z("31181719929966183601"),
        new Z("100000000000000000000"),
        new Z("283942098606901565601")
      });
  }
}
