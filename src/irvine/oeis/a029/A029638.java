package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029638 Numbers in the (1,2)-Pascal triangle A029635 that are different from 1.
 * @author Sean A. Irvine
 */
public class A029638 extends A029635 {

  /** Construct the sequence. */
  public A029638() {
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
