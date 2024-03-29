package irvine.oeis.a192;
// Generated by gen_seq4.pl simgcd at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A192314 For n &gt;= 3, draw a regular n-sided polygon and its n*(n-3)/2 diagonals, so there are n*(n-1)/2 lines; a(n) is the number of ways to choose a nonempty subset of these lines (subsets differing by a rotation are regarded as identical). a(1)=0, a(2)=1 by convention.
 * @author Georg Fischer
 */
public class A192314 extends AbstractSequence {

  private final AbstractSequence mSeq = new A192332();

  /** Construct the sequence. */
  public A192314() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(1);
  }
}
