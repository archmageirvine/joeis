package irvine.oeis.a192;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000957;

/**
 * A192675 Floor-Sqrt transform of large Fine numbers (A000957).
 * @author Georg Fischer
 */
public class A192675 extends Sequence0 {

  private A000957 mSeq = new A000957();

  @Override
  public Z next() {
    return CR.valueOf(mSeq.next()).sqrt().floor();
  }
}
