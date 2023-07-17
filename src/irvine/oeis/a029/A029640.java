package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029640 Even numbers in the (1,2)-Pascal triangle A029635.
 * @author Sean A. Irvine
 */
public class A029640 extends A029635 {

  /** Construct the sequence. */
  public A029640() {
    super(1);
  }

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isOdd());
    return t;
  }
}
