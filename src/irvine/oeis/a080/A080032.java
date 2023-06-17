package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A080032 a(n) is taken to be the smallest positive integer not already present which is consistent with the condition "n is a member of the sequence if and only if a(n) is even".
 * <code>a(4m)=6m, a(4m+1)=4m+3, a(4m+2)=6m+2, a(4m+3)=6m+4</code>.
 * @author Georg Fischer
 */
public class A080032 extends AbstractSequence {

  /** Construct the sequence. */
  public A080032() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long mod = mN / 4;
    switch (mN % 4) {
      case 0:
        return Z.valueOf(6 * mod);
      case 1:
        return mod == 0 ? Z.TWO : Z.valueOf(4 * mod + 3);
      case 2:
        return mod == 0 ? Z.FOUR : Z.valueOf(6 * mod + 2);
      case 3:
      default:
        return mod == 0 ? Z.ONE : Z.valueOf(6 * mod + 4);
    }
  }
}
