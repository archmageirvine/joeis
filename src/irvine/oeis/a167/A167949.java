package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A167949 Number of reduced words of length n in Coxeter group on 33 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167949() {
    super(new long[] {-496, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31},
      new Z[] {
        Z.valueOf(33),
        Z.valueOf(1056),
        Z.valueOf(33792),
        Z.valueOf(1081344),
        Z.valueOf(34603008),
        Z.valueOf(1107296256),
        Z.valueOf(35433480192L),
        Z.valueOf(1133871366144L),
        Z.valueOf(36283883716608L),
        Z.valueOf(1161084278931456L),
        Z.valueOf(37154696925806592L),
        Z.valueOf(1188950301625810944L),
        new Z("38046409652025950208"),
        new Z("1217485108864830406656"),
        new Z("38959523483674573012992"),
        new Z("1246704751477586336415216")
      }, Z.ONE);
  }
}
