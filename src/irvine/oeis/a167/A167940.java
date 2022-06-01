package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A167940 Number of reduced words of length n in Coxeter group on 25 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167940() {
    super(new long[] {-276, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23},
      new Z[] {Z.valueOf(25), Z.valueOf(600), Z.valueOf(14400), Z.valueOf(345600), Z.valueOf(8294400), Z.valueOf(199065600), Z.valueOf(4777574400L), Z.valueOf(114661785600L), Z.valueOf(2751882854400L), Z.valueOf(66045188505600L), Z.valueOf(1585084524134400L), Z.valueOf(38042028579225600L), Z.valueOf(913008685901414400L), new Z("21912208461633945600"), new Z("525893003079214694400"), new Z("12621432073901152665300")}, Z.ONE);
  }
}
