package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005679 A squarefree <code>(or Thue-Morse)</code> ternary sequence: closed under <code>a-&gt;abc, b-&gt;ac, c-&gt;b</code>.
 * @author Sean A. Irvine
 */
public class A005679 implements Sequence {

  private StringBuilder mSeq = new StringBuilder("213");
  private int mPos = -1;
  private int mRepPos = 0;

  @Override
  public Z next() {
    if (++mPos >= mSeq.length()) {
      switch (mSeq.charAt(++mRepPos)) {
        case '1':
          mSeq.append("23");
          break;
        case '2':
          mSeq.append("213");
          break;
        default:
          mSeq.append('1');
      }
    }
    return Z.valueOf(mSeq.charAt(mPos) - '0');
  }
}

