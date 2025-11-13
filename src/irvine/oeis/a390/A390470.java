package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A390470 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A390470 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A390470() {
    super(1, (self, p, e) -> {
      if (Z.TWO.equals(p)) {
        return Z.ONE.shiftLeft(e - 1);
      }
      if (Z.FIVE.equals(p)) {
        return Z.FIVE.pow(e - 1).multiply(4);
      }
      return p.pow(e - 1).multiply(p.subtract(2));
    });
  }
}
