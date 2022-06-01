package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A167829 Number of reduced words of length n in Coxeter group on 40 generators S_i with relations (S_i)^2 = (S_i S_j)^15 = I.
 * @author Sean A. Irvine
 */
public class A167829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167829() {
    super(new long[] {-741, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38},
      new Z[] {Z.valueOf(40), Z.valueOf(1560), Z.valueOf(60840), Z.valueOf(2372760), Z.valueOf(92537640), Z.valueOf(3608967960L), Z.valueOf(140749750440L), Z.valueOf(5489240267160L), Z.valueOf(214080370419240L), Z.valueOf(8349134446350360L), Z.valueOf(325616243407664040L), new Z("12699033492898897560"), new Z("495262306223057004840"), new Z("19315229942699223188760"), new Z("753293967765269704360860")}, Z.ONE);
  }
}
