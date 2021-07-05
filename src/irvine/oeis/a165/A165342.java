package irvine.oeis.a165;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000265;
import irvine.oeis.a061.A061037;

/**
 * A165342 a(n) = A061037(n+2)/A000265(n+4).
 * @author Georg Fischer
 */
public class A165342 extends A061037 {

  private Sequence mA265;
  
  /** Construct the sequence. */
  public A165342() {
    mA265 = new A000265();
    mA265.next();
    mA265.next();
    mA265.next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA265.next());
  }

}
