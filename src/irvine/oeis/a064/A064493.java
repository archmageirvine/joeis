package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.RecordSequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a058.A058006;

/**
 * A064493 List of distinct greatest common divisors of { k! and k! - (k-1)! + (k-2)! - ... + (-1)^k*0!, k = 0 .. n}.
 * @author Sean A. Irvine
 */
public class A064493 extends RecordSequence {

  /** Construct the sequence. */
  public A064493() {
    super(new Combiner(new A000142(), new A058006(), Z::gcd));
  }
}
