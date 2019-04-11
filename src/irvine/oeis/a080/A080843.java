package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A080843 Tribonacci word: limit S(infinity), where S(0) <code>= 0,</code> S(1) <code>= 0,1,</code> S(2) <code>= 0,1,0,2</code> and for <code>n &gt;= 0,</code> S(n+3) = S(n+2) S(n+1) S(n).
 * @author Sean A. Irvine
 */
public class A080843 implements Sequence {

  private final StringBuilder mSeq = new StringBuilder("01");
  private int mN = -1;
  private int mExpandPos = 0;


  @Override
  public Z next() {
    if (++mN >= mSeq.length()) {
      final char c = mSeq.charAt(++mExpandPos);
      switch (c) {
        case '0':
          mSeq.append("01");
          break;
        case '1':
          mSeq.append("02");
          break;
        default:
          mSeq.append('0');
          break;
      }
    }
    return Z.valueOf(mSeq.charAt(mN) - '0');
  }

}
