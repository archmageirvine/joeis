package irvine.oeis.a117;
// manually primen/primenp at 2022-04-02 17:22

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a060.A060822;

/**
 * A117762 a(1)=6; for n&gt;1, a(n) = prime(n)*(prime(n)^2-1)/2.
 * @author Georg Fischer
 */
public class A117762 extends PrependSequence {

  /** Construct the sequence. */
  public A117762() {
    super(1, new A060822(1, (n, p) -> Z.valueOf(p).multiply(Z.valueOf(p).square().subtract(Z.ONE)).divide(Z.TWO)), 6);
  }
}
