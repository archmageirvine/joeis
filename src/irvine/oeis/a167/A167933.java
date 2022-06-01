package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A167933 Number of reduced words of length n in Coxeter group on 21 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167933() {
    super(new long[] {-190, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19},
      new Z[] {
        Z.valueOf(21),
        Z.valueOf(420),
        Z.valueOf(8400),
        Z.valueOf(168000),
        Z.valueOf(3360000),
        Z.valueOf(67200000),
        Z.valueOf(1344000000),
        Z.valueOf(26880000000L),
        Z.valueOf(537600000000L),
        Z.valueOf(10752000000000L),
        Z.valueOf(215040000000000L),
        Z.valueOf(4300800000000000L),
        Z.valueOf(86016000000000000L),
        Z.valueOf(1720320000000000000L),
        new Z("34406400000000000000"),
        new Z("688127999999999999790")
      }, Z.ONE);
  }
}
