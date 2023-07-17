package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029656 Numbers in the (2,1)-Pascal triangle A029653 that are different from 1.
 * @author Sean A. Irvine
 */
public class A029656 extends A029653 {

  /** Construct the sequence. */
  public A029656() {
    super(1);
  }

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.ONE.equals(t));
    return t;
  }
}
