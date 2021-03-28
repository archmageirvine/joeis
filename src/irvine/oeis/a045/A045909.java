package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a030.A030529;
import irvine.oeis.a055.A055879;
import irvine.oeis.a342.A342554;
import irvine.oeis.a342.A342570;

/**
 * A045909 Catafusenes (see reference for precise definition).
 * @author Sean A. Irvine
 */
public class A045909 extends A045906 {

  private final Sequence mC2vb = new A045908();
  private final Sequence mC2va = new A045907();
  private final Sequence mC = new A342554();
  private final Sequence mC4h = new A030529();
  private final Sequence mD2ha = new A342570();
  private final Sequence mD4h = new PrependSequence(new A055879(), 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z t = super.next().subtract(mC2va.next());
    if ((mN & 1) == 0) {
      t = t.subtract(mC.next()).subtract(mD2ha.next()).subtract(mC2vb.next());
      if ((mN & 3) == 0) {
        t = t.subtract(mC4h.next().multiply2()).subtract(mD4h.next());
      }
    }
    return t;
  }
}
