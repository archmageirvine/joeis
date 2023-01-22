package irvine.oeis.a112;
// manually rootet/rooteta at 2023-01-21 19:42

import irvine.math.z.Z;
import irvine.oeis.AddFiniteSequence;
import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a052.A052241;
import irvine.oeis.transform.RootSequence;

/**
 * A112153 McKay-Thompson series of class 16f for the Monster group.
 * <code>T16f=sqrtn(-4+P2(T8C)+O(x^MM),2), where T8C = A052241</code>
 * @author Georg Fischer
 */
public class A112153 extends RootSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A112153() {
    super(0, new AddFiniteSequence(1, new ZeroSpacedSequence(new A052241(), 7), 0, -4), 1, 2);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z result = super.next();
      if ((mN & 1) == 0) {
        return result;
      }
    }
  }
}
