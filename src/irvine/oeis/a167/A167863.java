package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167863 Number of reduced words of length n in Coxeter group on 48 generators S_i with relations (S_i)^2 = (S_i S_j)^15 = I.
 * @author Sean A. Irvine
 */
public class A167863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167863() {
    super(new long[] {-1081, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46},
      new Z[] {Z.ONE, Z.valueOf(48), Z.valueOf(2256), Z.valueOf(106032), Z.valueOf(4983504), Z.valueOf(234224688), Z.valueOf(11008560336L), Z.valueOf(517402335792L), Z.valueOf(24317909782224L), Z.valueOf(1142941759764528L), Z.valueOf(53718262708932816L), Z.valueOf(2524758347319842352L), new Z("118663642324032590544"), new Z("5577191189229531755568"), new Z("262127985893787992511696")});
  }
}
