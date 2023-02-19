package irvine.oeis.a279;

import irvine.math.z.Z;
import irvine.oeis.a282.A282000;
import irvine.oeis.a282.A282253;

/**
 * A279892 Eisenstein series E_18(q) (alternate convention E_9(q)), multiplied by 43867.
 * @author Georg Fischer
 */
public class A279892 extends A282000 {

  private final A282253 mSeq = new A282253();

  @Override
  public Z next() {
    return super.next().multiply(38367).add(mSeq.next().multiply(5500));
  }
}
