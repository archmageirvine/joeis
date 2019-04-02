package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167855 Number of reduced words of length n in Coxeter group on 45 generators S_i with relations (S_i)^2 = (S_i S_j)^15 = I.
 * @author Sean A. Irvine
 */
public class A167855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167855() {
    super(new long[] {-946, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43},
      new Z[] {Z.ONE, Z.valueOf(45), Z.valueOf(1980), Z.valueOf(87120), Z.valueOf(3833280), Z.valueOf(168664320), Z.valueOf(7421230080L), Z.valueOf(326534123520L), Z.valueOf(14367501434880L), Z.valueOf(632170063134720L), Z.valueOf(27815482777927680L), Z.valueOf(1223881242228817920L), new Z("53850774658067988480"), new Z("2369434084954991493120"), new Z("104255099738019625697280")});
  }
}
