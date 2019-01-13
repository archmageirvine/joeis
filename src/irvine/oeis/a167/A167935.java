package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167935.
 * @author Sean A. Irvine
 */
public class A167935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167935() {
    super(new long[] {-210, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20},
      new Z[] {Z.ONE, Z.valueOf(22), Z.valueOf(462), Z.valueOf(9702), Z.valueOf(203742), Z.valueOf(4278582), Z.valueOf(89850222), Z.valueOf(1886854662), Z.valueOf(39623947902L), Z.valueOf(832102905942L), Z.valueOf(17474161024782L), Z.valueOf(366957381520422L), Z.valueOf(7706105011928862L), Z.valueOf(161828205250506102L), Z.valueOf(3398392310260628142L), new Z("71366238515473190982")});
  }
}
