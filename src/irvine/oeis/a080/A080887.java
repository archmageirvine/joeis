package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a003.A003849;
import irvine.oeis.a010.A010060;

/**
 * A080887 Boolean XOR of (0,1) versions of Thue-Morse word (A010060) and Fibonacci word (A003849).
 * @author Sean A. Irvine
 */
public class A080887 extends Combiner {

  /** Construct the sequence. */
  public A080887() {
    super(1, new A010060(), new A003849(), Z::xor);
  }
}

