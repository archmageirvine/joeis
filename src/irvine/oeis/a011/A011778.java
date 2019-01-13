package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;

/**
 * A011778.
 * @author Sean A. Irvine
 */
public class A011778 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A011778() {
    super(new A011776(), 1);
  }

  @Override
  public Z next() {
    return super.next().max(Z.TWO); // Work around strange initial balue
  }
}
