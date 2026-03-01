package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a178.A178914;

/**
 * A083989 Concatenation of prime k and its 10's complement is a prime.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A083989 extends FilterSequence {

  private static final A178914 SEQ = new A178914();

  /** Construct the sequence. */
  public A083989() {
    super(1, new A000040(), v -> new Z(v.toString() + SEQ.a(v).toString()).isProbablePrime());
  }
}
