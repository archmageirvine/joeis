package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a002.A002251;

/**
 * A026245 a(n) = (1/2)*(s(n) + 1), where s(n) is the n-th odd number in A002251.
 * @author Sean A. Irvine
 */
public class A026245 extends A002251 {

  /** Construct the sequence. */
  public A026245() {
    super(1);
  }

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t.add(1).divide2();
  }
}
