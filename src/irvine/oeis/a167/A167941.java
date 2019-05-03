package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167941 Number of reduced words of length n in Coxeter group on 26 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^16 =</code> I.
 * @author Sean A. Irvine
 */
public class A167941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167941() {
    super(new long[] {-300, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24},
      new Z[] {Z.valueOf(26), Z.valueOf(650), Z.valueOf(16250), Z.valueOf(406250), Z.valueOf(10156250), Z.valueOf(253906250), Z.valueOf(6347656250L), Z.valueOf(158691406250L), Z.valueOf(3967285156250L), Z.valueOf(99182128906250L), Z.valueOf(2479553222656250L), Z.valueOf(61988830566406250L), Z.valueOf(1549720764160156250L), new Z("38743019104003906250"), new Z("968575477600097656250"), new Z("24214386940002441405925")}, Z.ONE);
  }
}
