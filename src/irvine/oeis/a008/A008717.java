package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A008717 20 in base <code>20-n</code>.
 * @author Sean A. Irvine
 */
public class A008717 extends FiniteSequence {

  /** Construct the sequence. */
  public A008717() {
    super(Z.TEN, Z.valueOf(11), Z.valueOf(12), Z.valueOf(13), Z.valueOf(14),
      Z.valueOf(15), Z.valueOf(16), Z.valueOf(17), Z.valueOf(18), Z.valueOf(19),
      Z.valueOf(20), Z.valueOf(22), Z.valueOf(24), Z.valueOf(26), Z.valueOf(32),
      Z.valueOf(40), Z.valueOf(110), Z.valueOf(202), Z.valueOf(10100),
      new Z("11111111111111111111"));
  }
}
