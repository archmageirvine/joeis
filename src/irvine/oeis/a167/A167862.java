package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167862 Number of reduced words of length n in Coxeter group on 47 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^15 =</code> I.
 * @author Sean A. Irvine
 */
public class A167862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167862() {
    super(new long[] {-1035, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},
      new Z[] {Z.valueOf(47), Z.valueOf(2162), Z.valueOf(99452), Z.valueOf(4574792), Z.valueOf(210440432), Z.valueOf(9680259872L), Z.valueOf(445291954112L), Z.valueOf(20483429889152L), Z.valueOf(942237774900992L), Z.valueOf(43342937645445632L), Z.valueOf(1993775131690499072L), new Z("91713656057762957312"), new Z("4218828178657096036352"), new Z("194066096218226417672192"), new Z("8927040426038415212919751")}, Z.ONE);
  }
}
