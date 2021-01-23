package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.CoordinationSequence;
import irvine.oeis.Sequence;

/**
 * A014678 Poincar\u00e9 series [or Poincare series] (or Molien series) for mod 2 cohomology of Lyons group.
 * @author Sean A. Irvine
 */
public class A014678 extends A014671 {

  private final Sequence mA = new CoordinationSequence(new long[] {0, 0, 0, 0, 0, 0, 0, 1}, new int[] {4, 6, 7});

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}

