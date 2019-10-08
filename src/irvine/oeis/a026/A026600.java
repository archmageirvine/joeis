package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026600 <code>a(n)</code> is the n-th letter of the infinite word generated from <code>w(1)=1</code> inductively by <code>w(n)=JUXTAPOSITION{w(n-1),w'(n-1),w"(n-1)}</code>, where <code>w(k)</code> becomes <code>w'(k)</code> by the cyclic permutation <code>1-&gt;2-&gt;3-&gt;1</code> and <code>w"(k) = (w')'(k)</code>.
 * @author Sean A. Irvine
 */
public class A026600 extends MemorySequence {

  private static final Z[] W = {Z.ONE, Z.TWO, Z.THREE};

  @Override
  protected Z computeNext() {
    final int n = size();
    return W[n <= 2 ? n : (int) get(n / 3).add(n + 2).mod(3)];
  }
}
