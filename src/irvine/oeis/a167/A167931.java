package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167931 Number of reduced words of length n in Coxeter group on 20 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167931() {
    super(new long[] {-171, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18},
      new Z[] {Z.valueOf(20), Z.valueOf(380), Z.valueOf(7220), Z.valueOf(137180), Z.valueOf(2606420), Z.valueOf(49521980), Z.valueOf(940917620), Z.valueOf(17877434780L), Z.valueOf(339671260820L), Z.valueOf(6453753955580L), Z.valueOf(122621325156020L), Z.valueOf(2329805177964380L), Z.valueOf(44266298381323220L), Z.valueOf(841059669245141180L), new Z("15980133715657682420"), new Z("303622540597495965790")}, Z.ONE);
  }
}
