package irvine.oeis.a039;
// Generated by gen_seq4.pl partcond at 2020-10-22 21:43
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a035.A035536;


/**
 * A039897 Number of partitions satisfying 0 &lt; cn(2,5) + cn(3,5).
 * @author Georg Fischer
 */
public class A039897 extends A035536 {

  /** Construct the sequence. */
  public A039897() {
    super(0, 5, 1, new int[] {  });
  }
  
  @Override
  protected Z total(final int[] cn) {
    return (0 < cn[2] + cn[3]) ? Z.ONE : Z.ZERO;
  }
}
