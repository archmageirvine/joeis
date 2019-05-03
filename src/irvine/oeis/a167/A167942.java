package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167942 Number of reduced words of length n in Coxeter group on 27 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^16 =</code> I.
 * @author Sean A. Irvine
 */
public class A167942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167942() {
    super(new long[] {-325, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25},
      new Z[] {Z.valueOf(27), Z.valueOf(702), Z.valueOf(18252), Z.valueOf(474552), Z.valueOf(12338352), Z.valueOf(320797152), Z.valueOf(8340725952L), Z.valueOf(216858874752L), Z.valueOf(5638330743552L), Z.valueOf(146596599332352L), Z.valueOf(3811511582641152L), Z.valueOf(99099301148669952L), Z.valueOf(2576581829865418752L), new Z("66991127576500887552"), new Z("1741769316989023076352"), new Z("45286002241714599984801")}, Z.ONE);
  }
}
