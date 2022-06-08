package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A080031 a(n) is taken to be the smallest positive integer not already present which is consistent with the condition "n is a member of the sequence if and only if a(n) is congruent to 2 mod 3".
 * <code>a(3m)=3m+1, a(3m+1)=6m+2, a(3m+2)=6m-1</code>.
 * @author Georg Fischer
 */
public class A080031 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long mod = mN / 3;
    switch (mN % 3) {
      case 0:
        return Z.valueOf(3 * mod + 1);
      case 1:
        return Z.valueOf(6 * mod + 2);
      case 2:
      default:
        return Z.valueOf(6 * mod + 5);
    }
  }
}
