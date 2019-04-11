package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A092606 Fixed point of the morphism <code>0 -&gt; 021, 1 -&gt; 0, 2 -&gt; 0</code>; starting with <code>a(1) = 0</code>.
 * @author Sean A. Irvine
 */
public class A092606 implements Sequence {

  private final StringBuilder mSeq = new StringBuilder("021");
  private int mN = -1;
  private int mExpandPos = 0;


  @Override
  public Z next() {
    if (++mN >= mSeq.length()) {
      final char c = mSeq.charAt(++mExpandPos);
      if (c == '0') {
        mSeq.append("021");
      } else {
        mSeq.append('0');
      }
    }
    return Z.valueOf(mSeq.charAt(mN) - '0');
  }

}
