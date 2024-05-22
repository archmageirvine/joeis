package irvine.oeis.a291;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A291804 a(n) = sigma(A291789(n)).
 * @author Sean A. Irvine
 */
public class A291804 extends A291789 {

  /** Construct the sequence. */
  public A291804() {
    super(1);
  }

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
