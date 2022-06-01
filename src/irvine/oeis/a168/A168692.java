package irvine.oeis.a168;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A168692 Number of reduced words of length n in Coxeter group on 15 generators S_i with relations (S_i)^2 = (S_i S_j)^17 = I.
 * @author Sean A. Irvine
 */
public class A168692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168692() {
    super(new long[] {-91, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13},
      new Z[] {Z.valueOf(15), Z.valueOf(210), Z.valueOf(2940), Z.valueOf(41160), Z.valueOf(576240), Z.valueOf(8067360), Z.valueOf(112943040), Z.valueOf(1581202560), Z.valueOf(22136835840L), Z.valueOf(309915701760L), Z.valueOf(4338819824640L), Z.valueOf(60743477544960L), Z.valueOf(850408685629440L), Z.valueOf(11905721598812160L), Z.valueOf(166680102383370240L), Z.valueOf(2333521433367183360L), new Z("32669300067140566935")},
      Z.ONE);
  }
}
