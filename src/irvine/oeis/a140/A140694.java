package irvine.oeis.a140;

import irvine.math.z.Z;
import irvine.oeis.a014.A014963;
import irvine.oeis.a063.A063659;

/**
 * A140694 A014963(n) * A063659(n).
 * @author Georg Fischer
 */
public class A140694 extends A014963 {

  private A063659 mSeq2 = new A063659();

  @Override
  public Z next() {
    return super.next().multiply(mSeq2.next());
  }
}
