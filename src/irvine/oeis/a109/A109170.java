package irvine.oeis.a109;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A109170 Continued fraction expansion of 2*x which equals the continued fraction of x (A109168) interleaved with positive even numbers.
 * @author Georg Fischer
 */
public class A109170 extends ArrayList<Z> implements SequenceWithOffset {

  private int mN = 0;

  /** Construct the sequence. */
  public A109170() {
    add(Z.ZERO);
  }

  // (PARI) a(n)=if(n%2==1, (n+1), if(n%4==2, (n+2)/4, 2*a(n/2)))
  @Override
  public Z next() {
    ++mN;
    final Z result = (mN % 2 == 1) ? Z.valueOf(mN + 1) : ((mN % 4 == 2) ? Z.valueOf((mN + 2) / 4) : get(mN / 2).multiply(2));
    add(result);
    return result;
  }

  @Override
  public int getOffset() {
    return 1;
  }
}
