package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A026600 a(n) is the n-th letter of the infinite word generated from w(1)=1 inductively by w(n)=JUXTAPOSITION{w(n-1),w'(n-1),w"(n-1)}, where w(k) becomes w'(k) by the cyclic permutation 1-&gt;2-&gt;3-&gt;1 and w"(k) = (w')'(k).
 * @author Sean A. Irvine
 */
public class A026600 extends MemorySequence {

  {
    setOffset(1);
  }

  private static final Z[] W = {Z.ONE, Z.TWO, Z.THREE};

  @Override
  protected Z computeNext() {
    final int n = size();
    return W[n <= 2 ? n : (int) a(n / 3).add(n + 2).mod(3)];
  }
}
