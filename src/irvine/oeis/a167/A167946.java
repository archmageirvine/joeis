package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167946 Number of reduced words of length n in Coxeter group on 31 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167946() {
    super(new long[] {-435, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29},
      new Z[] {Z.valueOf(31), Z.valueOf(930), Z.valueOf(27900), Z.valueOf(837000), Z.valueOf(25110000), Z.valueOf(753300000), Z.valueOf(22599000000L), Z.valueOf(677970000000L), Z.valueOf(20339100000000L), Z.valueOf(610173000000000L), Z.valueOf(18305190000000000L), Z.valueOf(549155700000000000L), new Z("16474671000000000000"), new Z("494240130000000000000"), new Z("14827203900000000000000"), new Z("444816116999999999999535")}, Z.ONE);
  }
}
