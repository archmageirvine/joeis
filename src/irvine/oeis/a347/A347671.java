package irvine.oeis.a347;
// manually 

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A347671 a(n) = n^n mod 100.
 * @author Georg Fischer
 */
public class A347671 implements Sequence {

  private int mN = -1;
  private final Z mZ100 = Z.valueOf(100);

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : Z.valueOf(mN).pow(mN).mod(mZ100);
  }
}
