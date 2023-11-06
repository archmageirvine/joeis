package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066755 Numbers n such that n^2 + 1 is not divisible by k^2 + 1 for any k in [1,n-1].
 * @author Sean A. Irvine
 */
public class A066755 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066755() {
    super(1, new A066743(), Z.ONE::equals);
  }
}

