package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167937 Number of reduced words of length n in Coxeter group on 23 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167937() {
    super(new long[] {-231, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21},
      new Z[] {Z.ONE, Z.valueOf(23), Z.valueOf(506), Z.valueOf(11132), Z.valueOf(244904), Z.valueOf(5387888), Z.valueOf(118533536), Z.valueOf(2607737792L), Z.valueOf(57370231424L), Z.valueOf(1262145091328L), Z.valueOf(27767192009216L), Z.valueOf(610878224202752L), Z.valueOf(13439320932460544L), Z.valueOf(295665060514131968L), Z.valueOf(6504631331310903296L), new Z("143101889288839872512")});
  }
}
