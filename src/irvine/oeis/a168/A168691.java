package irvine.oeis.a168;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A168691 Number of reduced words of length n in Coxeter group on 14 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^17 =</code> I.
 * @author Sean A. Irvine
 */
public class A168691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168691() {
    super(new long[] {-78, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12},
      new Z[] {Z.valueOf(14), Z.valueOf(182), Z.valueOf(2366), Z.valueOf(30758), Z.valueOf(399854), Z.valueOf(5198102), Z.valueOf(67575326), Z.valueOf(878479238), Z.valueOf(11420230094L), Z.valueOf(148462991222L), Z.valueOf(1930018885886L), Z.valueOf(25090245516518L), Z.valueOf(326173191714734L), Z.valueOf(4240251492291542L), Z.valueOf(55123269399790046L), Z.valueOf(716602502197270598L), new Z("9315832528564517683")},
      Z.ONE);
  }
}
