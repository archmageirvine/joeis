package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A167818 Number of reduced words of length n in Coxeter group on 37 generators S_i with relations (S_i)^2 = (S_i S_j)^15 = I.
 * @author Sean A. Irvine
 */
public class A167818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167818() {
    super(new long[] {-630, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35},
      new Z[] {Z.valueOf(37), Z.valueOf(1332), Z.valueOf(47952), Z.valueOf(1726272), Z.valueOf(62145792), Z.valueOf(2237248512L), Z.valueOf(80540946432L), Z.valueOf(2899474071552L), Z.valueOf(104381066575872L), Z.valueOf(3757718396731392L), Z.valueOf(135277862282330112L), Z.valueOf(4870003042163884032L), new Z("175320109517899825152"), new Z("6311523942644393705472"), new Z("227214861935198173396326")}, Z.ONE);
  }
}
