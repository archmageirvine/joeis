package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167861.
 * @author Sean A. Irvine
 */
public class A167861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167861() {
    super(new long[] {-990, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44},
      new Z[] {Z.ONE, Z.valueOf(46), Z.valueOf(2070), Z.valueOf(93150), Z.valueOf(4191750), Z.valueOf(188628750), Z.valueOf(8488293750L), Z.valueOf(381973218750L), Z.valueOf(17188794843750L), Z.valueOf(773495767968750L), Z.valueOf(34807309558593750L), Z.valueOf(1566328930136718750L), new Z("70484801856152343750"), new Z("3171816083526855468750"), new Z("142731723758708496093750")});
  }
}
