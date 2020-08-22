package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A003733 Number of spanning trees in C_5 X P_n.
 * @author Sean A. Irvine
 */
public class A003733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003733() {
    super(new long[] {1, -319, 12441, -128319, 408001, -408001, 128319, -12441, 319},
      new Z[] {
        Z.FIVE,
        Z.valueOf(1805),
        Z.valueOf(508805),
        Z.valueOf(140503005),
        Z.valueOf(38720000000L),
        Z.valueOf(10668237057005L),
        Z.valueOf(2939274449134805L),
        Z.valueOf(809816405722655805L),
        new Z("223117116976138566005")}
    );
  }
}
