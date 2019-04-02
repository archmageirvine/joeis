package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167950 Number of reduced words of length n in Coxeter group on 34 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167950() {
    super(new long[] {-528, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32},
      new Z[] {Z.ONE, Z.valueOf(34), Z.valueOf(1122), Z.valueOf(37026), Z.valueOf(1221858), Z.valueOf(40321314), Z.valueOf(1330603362), Z.valueOf(43909910946L), Z.valueOf(1449027061218L), Z.valueOf(47817893020194L), Z.valueOf(1577990469666402L), Z.valueOf(52073685498991266L), Z.valueOf(1718431621466711778L), new Z("56708243508401488674"), new Z("1871372035777249126242"), new Z("61755277180649221165986")});
  }
}
