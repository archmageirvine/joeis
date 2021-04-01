package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a033.A033637;

/**
 * A046064 Not a product of partition numbers (A000041).
 * @author Sean A. Irvine
 */
public class A046064 extends ComplementSequence {

  /** Construct the sequence. */
  public A046064() {
    super(new A033637(), Z.ONE);
  }
}
