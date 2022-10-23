package irvine.oeis.a308;

import java.util.Stack;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A308551 Start with an empty stack S; for n = 1, 2, 3, ..., interpret the binary representation of n from left to right as follows: in case of bit 1, push the number 1 on top of S, in case of bit 0, replace the two numbers on top of S with their sum; a(n) gives the number on top of S after processing n.
 * @author Sean A. Irvine
 */
public class A308551 extends Sequence1 {

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
