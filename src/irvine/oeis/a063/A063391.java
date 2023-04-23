package irvine.oeis.a063;

import irvine.math.group.GaloisField;
import irvine.math.z.Z;

/**
 * A063391 Number of solutions of x^8=1 in general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063391 extends A063385 {

  /** Construct the sequence. */
  public A063391() {
    super(new GaloisField(2), Z.EIGHT);
  }
}
