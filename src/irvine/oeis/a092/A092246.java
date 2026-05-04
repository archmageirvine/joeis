package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a010.A010060;

/**
 * A092246 Odd "odious" numbers (A000069).
 * @author Georg Fischer
 */
public class A092246 extends Sequence1 {

  private final Sequence mA010060 = new A010060();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.FOUR.multiply(Z.valueOf(mN)).add(Z.TWO.multiply(mA010060.next())).subtract(Z.THREE);
  }
}
