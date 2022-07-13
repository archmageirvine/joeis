package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a051.A051145;

/**
 * A057926 a(0) = 1, a(1) = 3, a(n) = smallest number such that sequence b(n) = a(n) OR a(n+1) is strictly monotonically increasing.
 * @author Sean A. Irvine
 */
public class A057926 extends A051145 {

  /** Construct the sequence. */
  public A057926() {
    super(Z.ONE, Z.THREE);
  }
}
