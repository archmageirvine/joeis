package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005723 Quadrinomial coefficients.
 * @author Sean A. Irvine
 */
public class A005723 extends A005190 {

  /** Construct the sequence. */
  public A005723() {
    super(1);
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

