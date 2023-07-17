package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A039653 a(0) = 0; for n &gt; 0, a(n) = sigma(n)-1.
 * @author Sean A. Irvine
 */
public class A039653 extends A000203 {

  /** Construct the sequence. */
  public A039653() {
    super(0);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().subtract(1);
  }
}
