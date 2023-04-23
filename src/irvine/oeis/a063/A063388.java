package irvine.oeis.a063;

import irvine.math.group.GaloisField;
import irvine.math.z.Z;

/**
 * A063388 Number of solutions of x^5=1 in general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063388 extends A063385 {

  /** Construct the sequence. */
  public A063388() {
    super(new GaloisField(2), Z.FIVE);
  }
}
