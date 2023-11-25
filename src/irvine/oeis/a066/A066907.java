package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A066902.
 * @author Sean A. Irvine
 */
public class A066907 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A066907() {
    super(1, (p, e) -> Z.TWO.equals(p)
      ? (e == 1 ? Z.FOUR : (e == 2 ? Z.valueOf(28) : Z.NINE.shiftLeft(2L * (e - 1)).add(32)))
      : p.pow(2L * e - 1).multiply(p.add(1)).add(2));
  }
}

