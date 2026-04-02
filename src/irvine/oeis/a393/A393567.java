package irvine.oeis.a393;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000025;
import irvine.oeis.a053.A053256;

/**
 * A393567 allocated for Joesph Daniel Burke III.
 * @author Sean A. Irvine
 */
public class A393567 extends CachedSequence {

  private static final Sequence A053256 = new A053256().skip();
  private static final DirectSequence A000025 = DirectSequence.create(new A000025());

  /** Construct the sequence. */
  public A393567() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      return A053256.next().subtract(Integers.SINGLETON.sum(1, n, k -> A000025.a(k).multiply(self.a(n - k))));
    });
  }
}
