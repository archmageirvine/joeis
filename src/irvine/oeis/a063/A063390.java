package irvine.oeis.a063;

import irvine.math.group.GaloisField;
import irvine.math.z.Z;

/**
 * A063390 Number of solutions of x^7=1 in general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063390 extends A063385 {

  /** Construct the sequence. */
  public A063390() {
    super(new GaloisField(2), Z.SEVEN);
  }
}
