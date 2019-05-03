package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.a002.A002203;

/**
 * A100227 Main diagonal of triangle <code>A100226</code>.
 * @author Sean A. Irvine
 */
public class A100227 extends A002203 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
