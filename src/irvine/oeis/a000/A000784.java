package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a048.A048140;
import irvine.oeis.a048.A048141;

/**
 * A000784 Symmetrical planar partitions of n: planar partitions (A000219) that when regarded as 3-D objects have just one symmetry plane).
 * @author Sean A. Irvine
 */
public class A000784 extends A048140 {

  private final Sequence mC3v = new A048141();
  private final Sequence mA219 = new SkipSequence(new A000219(), 1);

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mC3v.next()).subtract(mA219.next());
  }
}
