package irvine.oeis.a047;

import irvine.math.group.BinaryAbelianSubgroups;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047052 Number of Abelian subgroups of Chevalley group A_n(2) (the group of nonsingular n X n matrices over GF(2)).
 * @author Gregory Morse
 */
public class A047052 extends Sequence1 {

  private final BinaryAbelianSubgroups mGroups = new BinaryAbelianSubgroups();
  private int mN = 0;

  @Override
  public Z next() {
    return mGroups.count(++mN);
  }
}
