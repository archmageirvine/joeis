package irvine.oeis.a064;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000108;
import irvine.oeis.a000.A000110;

/**
 * A064299 a(n) = B(n)*C(n), where B(n) are Bell numbers (A000110) and C(n) are Catalan numbers (A000108).
 * @author Sean A. Irvine
 */
public class A064299 extends Combiner {

  /** Construct the sequence. */
  public A064299() {
    super(new A000110(), new A000108(), MULTIPLY);
  }
}
