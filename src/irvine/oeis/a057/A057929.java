package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a051.A051145;

/**
 * A057929 a(0)=2, a(1)=5, a(n) = smallest number such that sequence b(n) = a(n) OR a(n+1) is strictly monotonically increasing.
 * @author Sean A. Irvine
 */
public class A057929 extends A051145 {

  /** Construct the sequence. */
  public A057929() {
    super(Z.TWO, Z.FIVE);
  }
}
