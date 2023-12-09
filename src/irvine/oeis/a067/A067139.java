package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a066.A066376;

/**
 * A067139 Irreducible elements in OR-numbral arithmetic.
 * @author Sean A. Irvine
 */
public class A067139 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A067139() {
    super(1, new A066376(), k -> k.compareTo(Z.ONE) <= 0);
  }
}
