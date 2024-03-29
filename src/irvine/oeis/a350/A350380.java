package irvine.oeis.a350;
// Generated by gen_seq4.pl dirtraf at 2024-02-05 19:10

import irvine.oeis.a014.A014963;
import irvine.oeis.a027.A027750;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A350380 Triangle read by rows in which row n lists A014963(d), the exponential of Mangoldt function, for each divisor d of n.
 * @author Georg Fischer
 */
public class A350380 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A350380() {
    super(1, new A014963(), new A027750());
  }
}
