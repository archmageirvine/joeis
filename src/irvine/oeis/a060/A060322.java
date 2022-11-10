package irvine.oeis.a060;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060322 Consider the version of the Collatz or 3x+1 problem where x -&gt; x/2 if x is even, x -&gt; (3x+1)/2 if x is odd. Define the stopping time of x to be the number of steps needed to reach 1. Sequence gives the number of integers x with stopping time n.
 * @author Sean A. Irvine
 */
public class A060322 extends Sequence1 {

  private HashSet<Z> mS = new HashSet<>();
  {
    mS.add(Z.ONE);
  }

  @Override
  public Z next() {
    final HashSet<Z> s = new HashSet<>(mS.size() * 2);
    for (final Z v : mS) {
      s.add(v.multiply2());
      final Z[] qr = v.divideAndRemainder(Z.THREE);
      if (Z.ONE.equals(qr[1]) && qr[0].isOdd() && qr[0].compareTo(Z.ONE) > 0) {
        s.add(qr[0].multiply2());
      }
    }
    mS = s;
    return Z.valueOf(mS.size());
  }
}
