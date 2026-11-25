package irvine.oeis.a066;

import irvine.math.group.Gl2NormalSubgroups;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066541 Number of normal subgroups of the group GL(2,Z_n) of invertible 2 X 2 matrices mod n (sequence A000252).
 * @author Gregory Morse
 */
public class A066541 extends Sequence1 {

  private final Gl2NormalSubgroups mGroups = new Gl2NormalSubgroups();
  private long mN = 0;

  @Override
  public Z next() {
    return mGroups.count(++mN);
  }
}
