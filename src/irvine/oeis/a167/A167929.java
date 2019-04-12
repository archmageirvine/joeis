package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167929 Number of reduced words of length n in Coxeter group on 19 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167929() {
    super(new long[] {-153, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17}, new Z[] {Z.valueOf(19), Z.valueOf(342), Z.valueOf(6156), Z.valueOf(110808), Z.valueOf(1994544), Z.valueOf(35901792), Z.valueOf(646232256), Z.valueOf(11632180608L), Z.valueOf(209379250944L), Z.valueOf(3768826516992L), Z.valueOf(67838877305856L), Z.valueOf(1221099791505408L), Z.valueOf(21979796247097344L), Z.valueOf(395636332447752192L), Z.valueOf(7121453984059539456L), new Z("128186171713071710037")}, Z.ONE);
  }
}
