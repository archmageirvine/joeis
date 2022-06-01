package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A167943 Number of reduced words of length n in Coxeter group on 28 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167943() {
    super(new long[] {-351, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26},
      new Z[] {Z.valueOf(28), Z.valueOf(756), Z.valueOf(20412), Z.valueOf(551124), Z.valueOf(14880348), Z.valueOf(401769396), Z.valueOf(10847773692L), Z.valueOf(292889889684L), Z.valueOf(7908027021468L), Z.valueOf(213516729579636L), Z.valueOf(5764951698650172L), Z.valueOf(155653695863554644L), Z.valueOf(4202649788315975388L), new Z("113471544284531335476"), new Z("3063731695682346057852"), new Z("82720755783423343561626")}, Z.ONE);
  }
}
