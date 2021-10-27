package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a048.A048994;

/**
 * A087748 Triangle formed by reading triangle of Stirling numbers of the first kind (A048994) mod 2. 
 * @author Georg Fischer
 */
public class A087748 extends A048994 {

  @Override
  public Z next() {
    return super.next().mod(Z.TWO);
  }
}
