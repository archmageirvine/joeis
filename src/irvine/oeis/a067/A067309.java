package irvine.oeis.a067;
// Generated by gen_seq4.pl anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000273;
import irvine.oeis.a051.A051504;

/**
 * A067309 Number of symmetric unlabeled digraphs (unlabeled digraphs with nontrivial automorphism group).
 * @author Georg Fischer
 */
public class A067309 extends AbstractSequence {

  private final A000273 mSeq1 = new A000273();
  private final A051504 mSeq2 = new A051504();

  /** Construct the sequence. */
  public A067309() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
