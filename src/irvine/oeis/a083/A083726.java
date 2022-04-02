package irvine.oeis.a083;
// manually primen/primenp at 2022-04-02 17:22

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a060.A060822;

/**
 * A083726 a(n) = (prime(n)+1)*n.
 * @author Georg Fischer
 */
public class A083726 extends PrependSequence {

  /** Construct the sequence. */
  public A083726() {
    super(new A060822(0, (n, p) -> Z.valueOf(p).add(Z.ONE).multiply(Z.valueOf(n))), 0);
  }
}
