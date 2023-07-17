package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029652 Odd numbers in the (1,2)-Pascal triangle A029635.
 * @author Sean A. Irvine
 */
public class A029652 extends A029635 {

  /** Construct the sequence. */
  public A029652() {
    super(1);
  }

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
