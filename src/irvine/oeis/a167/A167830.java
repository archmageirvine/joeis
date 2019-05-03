package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167830 Number of reduced words of length n in Coxeter group on 41 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^15 =</code> I.
 * @author Sean A. Irvine
 */
public class A167830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167830() {
    super(new long[] {-780, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39},
      new Z[] {
        Z.valueOf(41),
        Z.valueOf(1640),
        Z.valueOf(65600),
        Z.valueOf(2624000),
        Z.valueOf(104960000),
        Z.valueOf(4198400000L),
        Z.valueOf(167936000000L),
        Z.valueOf(6717440000000L),
        Z.valueOf(268697600000000L),
        Z.valueOf(10747904000000000L),
        Z.valueOf(429916160000000000L),
        new Z("17196646400000000000"),
        new Z("687865856000000000000"),
        new Z("27514634240000000000000"),
        new Z("1100585369599999999999180")
      }, Z.ONE);
  }
}
