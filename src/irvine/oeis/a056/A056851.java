package irvine.oeis.a056;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a034.A034886;

/**
 * A056851 Integers n such that the number of digits in n! is a cube.
 * @author Sean A. Irvine
 */
public class A056851 extends A034886 {

  /** Construct the sequence. */
  public A056851() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (Predicates.CUBE.is(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
