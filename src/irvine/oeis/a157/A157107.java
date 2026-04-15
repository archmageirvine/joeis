package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a090.A090822;

/**
 * A157107 Indices of 4's in A090822.
 * @author Sean A. Irvine
 */
public class A157107 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A157107() {
    super(1, new A090822(), Z.FOUR::equals);
  }
}
