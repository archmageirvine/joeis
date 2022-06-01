package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A167952 Number of reduced words of length n in Coxeter group on 36 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167952() {
    super(new long[] {-595, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34},
      new Z[] {Z.valueOf(36), Z.valueOf(1260), Z.valueOf(44100), Z.valueOf(1543500), Z.valueOf(54022500), Z.valueOf(1890787500), Z.valueOf(66177562500L), Z.valueOf(2316214687500L), Z.valueOf(81067514062500L), Z.valueOf(2837362992187500L), Z.valueOf(99307704726562500L), Z.valueOf(3475769665429687500L), new Z("121651938290039062500"), new Z("4257817840151367187500"), new Z("149023624405297851562500"), new Z("5215826854185424804686870")}, Z.ONE);
  }
}
