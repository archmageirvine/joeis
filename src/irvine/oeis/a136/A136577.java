package irvine.oeis.a136;
// manually hantraf at 2024-01-19 09:26

import irvine.math.z.Z;
import irvine.oeis.a086.A086616;
import irvine.oeis.transform.HankelTransformSequence;

/**
 * A136577 Conjectured Hankel transform of A136576(n+1).
 * @author Georg Fischer
 */
public class A136577 extends HankelTransformSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A136577() {
    super(0, new A086616(), 1);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return super.next();
  }
}
