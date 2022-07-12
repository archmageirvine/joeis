package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a051.A051145;

/**
 * A057923 a(0)=0, a(1)=2, a(n) = smallest number such that sequence b(n) = {a(n-1) BITWISE OR a(n)} is strictly monotonically increasing.
 * @author Sean A. Irvine
 */
public class A057923 extends A051145 {

  /** Construct the sequence. */
  public A057923() {
    super(Z.ZERO, Z.TWO);
  }
}
