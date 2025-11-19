package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A390299 Number of positive z &lt;= n such that z^2 - 9^g is relatively prime to n (for any particular positive integer g).
 * @author Sean A. Irvine
 */
public class A390299 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A390299() {
    super(1, (p, e) -> {
      if (Z.TWO.equals(p)) {
        return Z.TWO.pow(e - 1);
      }
      if (Z.THREE.equals(p)) {
        return Z.THREE.pow(e - 1).multiply2();
      }
      return p.pow(e - 1).multiply(p.subtract(2));
    });
  }
}
