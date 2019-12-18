package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.DottedHebrew;

/**
 * A027684 Number of letters in <code>n</code> (in "dotted" Hebrew).
 * @author Sean A. Irvine
 */
public class A027684 implements Sequence {

  // Do not use this to extend the sequence, underling class could be wrong

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(DottedHebrew.SINGLETON.toRawText(++mN).length());
  }
}
