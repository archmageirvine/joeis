package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000961;
import irvine.oeis.a051.A051451;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070705 extends Combiner {

  /** Construct the sequence. */
  public A070705() {
    super(1, new A051451().skip(), new A000961().skip(2), Z::mod);
  }
}
