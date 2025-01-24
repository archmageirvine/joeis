package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000010;

/**
 * A074641 a(n) = gcd(A074639(n), A000010(n)).
 * @author Sean A. Irvine
 */
public class A074641 extends Combiner {

  /** Construct the sequence. */
  public A074641() {
    super(1, new A074639().skip(), new A000010(), Z::gcd);
  }
}
