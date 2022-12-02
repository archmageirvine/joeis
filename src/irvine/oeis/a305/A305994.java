package irvine.oeis.a305;

import irvine.math.z.Z;
import irvine.oeis.a067.A067745;

/**
 * A305994 a(n) = ((A000265(3*n + 1) + 1) mod 4)/2.
 * @author Georg Fischer
 */
public class A305994 extends A067745 {

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    // a(n) = A067745(n+1) mod 4.
    return super.next().add(1).mod(Z.FOUR).divide(2);
  }
}
