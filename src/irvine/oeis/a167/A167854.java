package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167854 Number of reduced words of length n in Coxeter group on 44 generators S_i with relations (S_i)^2 = (S_i S_j)^15 = I.
 * @author Sean A. Irvine
 */
public class A167854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167854() {
    super(new long[] {-903, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42},
      new Z[] {
        Z.ONE,
        Z.valueOf(44),
        Z.valueOf(1892),
        Z.valueOf(81356),
        Z.valueOf(3498308),
        Z.valueOf(150427244),
        Z.valueOf(6468371492L),
        Z.valueOf(278139974156L),
        Z.valueOf(11960018888708L),
        Z.valueOf(514280812214444L),
        Z.valueOf(22114074925221092L),
        Z.valueOf(950905221784506956L),
        new Z("40888924536733799108"),
        new Z("1758223755079553361644"),
        new Z("75603621468420794550692")
      });
  }
}
