package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030176 Squares composed of digits {4,5,6}.
 * @author Sean A. Irvine
 */
public class A030176 extends A030177 {

  /** Construct the sequence. */
  public A030176() {
    super(1);
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
