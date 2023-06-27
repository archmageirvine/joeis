package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A106175 Numbers n such that n^2 = 67*m^2 + 67*m + 1.
 * @author Sean A. Irvine
 */
public class A106175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106175() {
    super(1, new long[] {-1, 0, 0, 0, 0, 0, 9542163854L, 0, 0, 0, 0, 0},
      new Z[] {Z.ONE, Z.valueOf(135), Z.valueOf(11791), Z.valueOf(3186521), Z.valueOf(278253009), Z.valueOf(14755412411L), Z.valueOf(24297576265L), Z.valueOf(1288470373299L), Z.valueOf(112511657189035L), Z.valueOf(30406305506223725L), Z.valueOf(2655135804746536821L), new Z("140798562959107191995")});
  }
}
