package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002110;

/**
 * A060881 a(n) = primorial(n) + prime(n + 1), where primorial(n) = A002110(n).
 * @author Sean A. Irvine
 */
public class A060881 extends Combiner {

  /** Construct the sequence. */
  public A060881() {
    super(new A002110(), new A000040(), ADD);
  }
}
