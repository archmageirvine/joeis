package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167944 Number of reduced words of length n in Coxeter group on 29 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167944() {
    super(new long[] {-378, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27},
      new Z[] {Z.ONE, Z.valueOf(29), Z.valueOf(812), Z.valueOf(22736), Z.valueOf(636608), Z.valueOf(17825024), Z.valueOf(499100672), Z.valueOf(13974818816L), Z.valueOf(391294926848L), Z.valueOf(10956257951744L), Z.valueOf(306775222648832L), Z.valueOf(8589706234167296L), Z.valueOf(240511774556684288L), Z.valueOf(6734329687587160064L), new Z("188561231252440481792"), new Z("5279714475068333490176")});
  }
}
