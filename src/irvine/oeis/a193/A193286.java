package irvine.oeis.a193;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A193286 a(n) is the maximal number of a&apos;s that can be produced in a blank document with n &quot;keystrokes&quot;.
 * <code>a(n) = 4*a(n-6)</code>
 * @author Georg Fischer
 */
public class A193286 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A193286() {
    super(1, 6, 0, "1, 2, 3, 4, 5, 6, 7, 9, 12, 16, 20, 25, 30, 36, 48, 64, 80, 100, 125, 150, 192, 256, 320, 400, 500, 625, 768, 1024, 1280, 1600, 2000, 2500, 3125");
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 6).multiply(4);
  }
}
