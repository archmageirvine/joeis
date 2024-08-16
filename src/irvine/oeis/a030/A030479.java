package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030479 Cubes with property that all even digits occur together and all odd digits occur together.
 * @author Sean A. Irvine
 */
public class A030479 extends A030478 {

  /** Construct the sequence. */
  public A030479() {
    super(1);
  }

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
