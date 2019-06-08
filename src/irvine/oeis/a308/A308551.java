package irvine.oeis.a308;

import java.util.Stack;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A308551.
 * @author Sean A. Irvine
 */
public class A308551 implements Sequence {

  private final Stack<Z> mStack = new Stack<>();
  private long mN = 0;

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) == '1') {
        mStack.push(Z.ONE);
      } else {
        mStack.push(mStack.pop().add(mStack.pop()));
      }
    }
    return mStack.peek();
  }
}
