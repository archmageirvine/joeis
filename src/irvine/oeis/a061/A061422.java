package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a100.A100359;

/**
 * A061422 Numbers k such that 2^(k-1) + k is prime.
 * @author Sean A. Irvine
 */
public class A061422 extends A100359 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

