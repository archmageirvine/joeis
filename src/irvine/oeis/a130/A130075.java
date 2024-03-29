package irvine.oeis.a130;
// Generated by gen_seq4.pl primen/primenp at 2022-04-02 17:52

import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A130075 a(n) = (5^p - 3^p - 2^p)/p, where p = prime(n).
 * @author Georg Fischer
 */
public class A130075 extends A060822 {

  /** Construct the sequence. */
  public A130075() {
    super(1, (n, p) -> Z.FIVE.pow(Z.valueOf(p)).subtract(Z.THREE.pow(Z.valueOf(p))).subtract(Z.TWO.pow(Z.valueOf(p))).divide(Z.valueOf(p)));
  }
}
