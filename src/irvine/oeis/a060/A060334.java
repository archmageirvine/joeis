package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a006.A006863;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A060334 The sequence A006863 (shifted by one) seems to be counting the periodic points for a map. If so, then this is the sequence of the numbers of orbits of length n.
 * @author Sean A. Irvine
 */
public class A060334 extends MobiusTransformSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A060334() {
    super(new A006863(), 1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
