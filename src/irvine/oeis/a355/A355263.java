package irvine.oeis.a355;
// Generated by gen_seq4.pl anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007947;
import irvine.oeis.a053.A053150;

/**
 * A355263 a(n) = largest-nth-power(n, 3) * radical(n) = A053150(n) * A007947(n), where the largest-nth-power(n, e) is the largest positive integer b such that b^e divides n.
 * @author Georg Fischer
 */
public class A355263 extends AbstractSequence {

  private final A053150 mSeq1 = new A053150();
  private final A007947 mSeq2 = new A007947();

  /** Construct the sequence. */
  public A355263() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
