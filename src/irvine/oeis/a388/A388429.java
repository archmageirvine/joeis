package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a389.A389240;

/**
 * A388429 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A388429 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A388429() {
    super(1, new A389240(), Z.NEG_ONE::equals);
  }
}

