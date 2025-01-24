package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000010;

/**
 * A074640 a(n) = A074639(n) mod A000010(n).
 * @author Sean A. Irvine
 */
public class A074640 extends Combiner {

  /** Construct the sequence. */
  public A074640() {
    super(1, new A074639().skip(), new A000010(), Z::mod);
  }
}
