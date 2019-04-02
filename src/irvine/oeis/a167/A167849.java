package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167849 Number of reduced words of length n in Coxeter group on 43 generators S_i with relations (S_i)^2 = (S_i S_j)^15 = I.
 * @author Sean A. Irvine
 */
public class A167849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167849() {
    super(new long[] {-861, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41},
      new Z[] {
        Z.ONE,
        Z.valueOf(43),
        Z.valueOf(1806),
        Z.valueOf(75852),
        Z.valueOf(3185784),
        Z.valueOf(133802928),
        Z.valueOf(5619722976L),
        Z.valueOf(236028364992L),
        Z.valueOf(9913191329664L),
        Z.valueOf(416354035845888L),
        Z.valueOf(17486869505527296L),
        Z.valueOf(734448519232146432L),
        new Z("30846837807750150144"),
        new Z("1295567187925506306048"),
        new Z("54413821892871264854016")
      });
  }
}
