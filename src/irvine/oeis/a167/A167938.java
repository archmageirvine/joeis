package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167938 Number of reduced words of length n in Coxeter group on 24 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167938() {
    super(new long[] {-253, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22},
      new Z[] {Z.ONE, Z.valueOf(24), Z.valueOf(552), Z.valueOf(12696), Z.valueOf(292008), Z.valueOf(6716184), Z.valueOf(154472232), Z.valueOf(3552861336L), Z.valueOf(81715810728L), Z.valueOf(1879463646744L), Z.valueOf(43227663875112L), Z.valueOf(994236269127576L), Z.valueOf(22867434189934248L), Z.valueOf(525950986368487704L), new Z("12096872686475217192"), new Z("278228071788929995416")});
  }
}
