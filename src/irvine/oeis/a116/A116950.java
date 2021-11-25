package irvine.oeis.a116;
// manually euleras at 2021-11-24 08:46

import irvine.math.z.Z;
import irvine.oeis.EulerTransform;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000081;
import irvine.oeis.a002.A002861;

/**
 * A116950 Number of functional patterns on n elements; or digraphs with maximum outdegree 1, n arrows and every point connected to an arrow.
 * Euler transform of A002861(n) + A000081(n+1).
 * @author Georg Fischer
 */
public class A116950 extends EulerTransform {

  private static class MySequence extends A000081 {
    private final Sequence mSeq2 = new A002861();

    private MySequence() {
      super.next();
      super.next();
    }

    @Override
    public Z next() {
      return super.next().add(mSeq2.next());
    }
  }

  /** Construct the sequence. */
  public A116950() {
    super(new MySequence(), 1);
  }
}
