package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167848 Number of reduced words of length n in Coxeter group on 42 generators S_i with relations (S_i)^2 = (S_i S_j)^15 = I.
 * @author Sean A. Irvine
 */
public class A167848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167848() {
    super(new long[] {-820, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40},
      new Z[] {
        Z.valueOf(42),
        Z.valueOf(1722),
        Z.valueOf(70602),
        Z.valueOf(2894682),
        Z.valueOf(118681962),
        Z.valueOf(4865960442L),
        Z.valueOf(199504378122L),
        Z.valueOf(8179679503002L),
        Z.valueOf(335366859623082L),
        Z.valueOf(13750041244546362L),
        Z.valueOf(563751691026400842L),
        new Z("23113819332082434522"),
        new Z("947666592615379815402"),
        new Z("38854330297230572431482"),
        new Z("1593027542186453469689901")
    }, Z.ONE);
  }
}
