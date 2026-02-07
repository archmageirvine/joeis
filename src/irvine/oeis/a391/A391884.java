package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a067.A067128;

/**
 * A083659.
 * @author Sean A. Irvine
 */
public class A391884 extends Sequence1 {

  private final Sequence mS = new A067128();

  @Override
  public Z next() {
    while (true) {
      final Z t = mS.next().add(1);
      final Z s = t.sqrt();
      if (t.auxiliary() == 1) {
        return s;
      }
    }
  }
}
