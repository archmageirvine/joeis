package irvine.oeis.a290;
// manually ietman at 2023-02-08 22:11

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A290750 Inverse Euler transform of [3, 13, 55, 233, 987, 4181, 17711, 75025, 317811, ...], Fibonacci(3*k+1).
 * @author Georg Fischer
 */
public class A290750 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A290750() {
    super(1, new A000045() {
      {
        super.next();
        super.next();
        super.next();
        super.next();
      }

      public Z next() {
        final Z result = super.next();
        super.next();
        super.next();
        return result;
      }
    }, 0);
    next();
  }
}
