package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000010;
import irvine.oeis.a048.A048865;

/**
 * A391883 a(n) = A000010(n) mod A048865(n).
 * @author Sean A. Irvine
 */
public class A391883 extends Combiner {

  /** Construct the sequence. */
  public A391883() {
    super(3, new A000010().skip(2), new A048865().skip(2), Z::mod);
  }
}

