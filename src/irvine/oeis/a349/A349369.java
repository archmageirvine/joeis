package irvine.oeis.a349;
// Generated by gen_seq4.pl anopan 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006369;

/**
 * A349369 Sum of A006369 and its Dirichlet inverse, where A006369 is the inverse of "amusical permutation", A006368.
 * @author Georg Fischer
 */
public class A349369 extends AbstractSequence {

  private final A006369 mSeq1 = new A006369();
  private final A349368 mSeq2 = new A349368();

  /** Construct the sequence. */
  public A349369() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
