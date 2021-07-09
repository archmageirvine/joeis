package irvine.oeis.a088;
// manually 2021-06-22

import irvine.math.z.Z;
import irvine.oeis.a001.A001850;

/**
 * A088917 Central Delannoy numbers (mod 3); Characteristic function for Cantor set.
 * @author Georg Fischer
 */

public class A088917 extends A001850 {
    
  /** Construct the sequence. */
  public A088917() {
  }
  
  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}
