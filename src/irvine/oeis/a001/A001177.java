package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001177.
 * @author Sean A. Irvine
 */
public class A001177 extends A001175 {

  private final A001176 mZeros = new A001176();

  @Override
  public Z next() {
    return super.next().divide(mZeros.next());
  }
}
