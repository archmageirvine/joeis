package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167861 Number of reduced words of length n in Coxeter group on 46 generators S_i with relations (S_i)^2 = (S_i S_j)^15 = I.
 * @author Sean A. Irvine
 */
public class A167861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167861() {
    super(new long[] {-990, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44},
      new Z[] {Z.valueOf(46), Z.valueOf(2070), Z.valueOf(93150), Z.valueOf(4191750), Z.valueOf(188628750), Z.valueOf(8488293750L), Z.valueOf(381973218750L), Z.valueOf(17188794843750L), Z.valueOf(773495767968750L), Z.valueOf(34807309558593750L), Z.valueOf(1566328930136718750L), new Z("70484801856152343750"), new Z("3171816083526855468750"), new Z("142731723758708496093750"), new Z("6422927569141882324217715")}, Z.ONE);
  }
}
