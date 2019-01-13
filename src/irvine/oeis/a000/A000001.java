package irvine.oeis.a000;

import irvine.math.group.GroupUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000001.
 * @author Sean A. Irvine
 */
public class A000001 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return GroupUtils.gnu(++mN);
  }
}
