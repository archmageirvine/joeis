package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A167880 Number of reduced words of length n in Coxeter group on 50 generators S_i with relations (S_i)^2 = (S_i S_j)^15 = I.
 * @author Sean A. Irvine
 */
public class A167880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167880() {
    super(new long[] {-1176, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48},
      new Z[] {Z.valueOf(50), Z.valueOf(2450), Z.valueOf(120050), Z.valueOf(5882450), Z.valueOf(288240050), Z.valueOf(14123762450L), Z.valueOf(692064360050L), Z.valueOf(33911153642450L), Z.valueOf(1661646528480050L), Z.valueOf(81420679895522450L), Z.valueOf(3989613314880600050L), new Z("195491052429149402450"), new Z("9579061569028320720050"), new Z("469374016882387715282450"), new Z("22999326827236998048838825")}, Z.ONE);
  }
}
