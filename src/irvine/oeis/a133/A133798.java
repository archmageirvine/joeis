package irvine.oeis.a133;
// manually divmul at 2021-08-20 23:36

import irvine.math.z.Z;
import irvine.oeis.a002.A002467;

/**
 * A133798 a(n) = A002467(n) - 1.
 * @author Georg Fischer
 */
public class A133798 extends A002467 {

  /** Construct the sequence. */
  public A133798() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
