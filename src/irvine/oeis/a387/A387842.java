package irvine.oeis.a387;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A387842 a(1) = 1, a(n) = Sum_{k=1..n-1} a(k)^n.
 * @author Sean A. Irvine
 */
public class A387842 extends CachedSequence {

  /** Construct the sequence. */
  public A387842() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Integers.SINGLETON.sum(1, n - 1, k -> self.a(k).pow(n)));
  }
}
