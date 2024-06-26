package irvine.oeis.a359;
// Generated by gen_seq4.pl anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a001.A001448;

/**
 * A359647 a(n) = [x^n] hypergeom([1/4, 3/4], [2], 64*x). The central terms of the Motzkin triangle A359364 without zeros.
 * @author Georg Fischer
 */
public class A359647 extends AbstractSequence {

  private final A000108 mSeq1 = new A000108();
  private final A001448 mSeq2 = new A001448();

  /** Construct the sequence. */
  public A359647() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
