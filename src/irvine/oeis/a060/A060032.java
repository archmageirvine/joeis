package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A060032 Ana sequence.
 * @author Georg Fischer
 */
public class A060032 implements SequenceWithOffset {

  private String mAn;

  /** Construct the sequence. */
  public A060032() {
    mAn = "1";
  }

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    final Z result = new Z(mAn);
    mAn = mAn.replaceAll("1", "ana").replaceAll("2", "ann");
    mAn = mAn.replaceAll("a", "1").replaceAll("n", "2");
    return result;
  }
}
