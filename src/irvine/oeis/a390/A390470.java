package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A390470 Number of positive z &lt;= n such that z^2 - 25^g is relatively prime to n (for any particular positive integer g).
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
